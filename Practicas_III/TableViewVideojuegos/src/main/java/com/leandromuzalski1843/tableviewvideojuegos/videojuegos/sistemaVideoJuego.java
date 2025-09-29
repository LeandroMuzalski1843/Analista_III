package com.leandromuzalski1843.tableviewvideojuegos.videojuegos;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.*;
import java.util.stream.Collectors;

public class sistemaVideoJuego extends Application {

    private final ObservableList<videoJuego> datosOriginales = FXCollections.observableArrayList(
            new videoJuego(201, "The Legend of Zelda: Ocarina of Time", "Nintendo", Arrays.asList("Aventura", "Acción"), 1998),
            new videoJuego(202, "Final Fantasy VII", "Square Enix", Arrays.asList("RPG", "Aventura"), 1997),
            new videoJuego(203, "The Witcher 3: Wild Hunt", "CD Projekt", Arrays.asList("RPG", "Acción", "Aventura"), 2015),
            new videoJuego(204, "Minecraft", "Mojang Studios", Arrays.asList("Sandbox", "Supervivencia"), 2011),
            new videoJuego(205, "Half-Life 2", "Valve", Arrays.asList("Shooter", "Ciencia ficción"), 2004),
            new videoJuego(206, "God of War", "Santa Monica Studio", Arrays.asList("Acción", "Aventura"), 2018)
    );


    private FilteredList<videoJuego> datosFiltrados;
    private TextField campoBusqueda;
    private TextField campoFiltroId;
    private final List<CheckBox> checkBoxesGeneros = new ArrayList<>();
    private ComboBox<Integer> comboAnioInicio;
    private ComboBox<Integer> comboAnioFin;
    private List<Integer> aniosDisponibles;

    @Override
    public void start(Stage primaryStage) {
        // 1. Crear la tabla y las columnas
        TableView<videoJuego> tablaVideoJuegos = new TableView<>();

        //crear las 5 columnas: id, titulo, autor, generos, año publicacion
        TableColumn<videoJuego,Integer> idColumna = new TableColumn<>("ID"); //Encabezado
        idColumna.setMinWidth(50);//Ancho
        idColumna.setCellValueFactory(new PropertyValueFactory<>("IdJuego"));

        TableColumn<videoJuego,String> tituloColumna = new TableColumn<>("Titulo");
        tituloColumna.setMinWidth(200);
        tituloColumna.setCellValueFactory(new PropertyValueFactory<>("titulo"));

        TableColumn<videoJuego,String> companiaColumna = new TableColumn<>("Compania");
        companiaColumna.setMinWidth(200);
        companiaColumna.setCellValueFactory(new PropertyValueFactory<>("compania"));

        TableColumn<videoJuego,List<String>> generosColumna = new TableColumn<>("Generos");
        generosColumna.setMinWidth(200);
        generosColumna.setCellValueFactory(new PropertyValueFactory<>("generos"));
        generosColumna.setCellFactory(column -> new TableCell<videoJuego,List<String>>(){
            @Override
            protected void updateItem(List<String> generos, boolean empty){
                super.updateItem(generos, empty);
                if(empty || generos == null){
                    setText(null);
                } else {
                    String cadenaGeneros = String.join(", ", generos);
                    setText(cadenaGeneros);
                }
            }
        });

        TableColumn<videoJuego,String> anioColumna = new TableColumn<>("Anio");
        anioColumna.setMinWidth(200);
        anioColumna.setCellValueFactory(new PropertyValueFactory<>("anioLanzamiento"));

        // agregar columnas a la tabla
        tablaVideoJuegos.getColumns().addAll(idColumna,tituloColumna,companiaColumna,generosColumna,anioColumna);

        // 2. Personalizar el mensaje de la tabla vacía
        tablaVideoJuegos.setPlaceholder(new Label("No existen videoJuegos en la vista"));

        // 3. Añadir el evento de doble clic
        tablaVideoJuegos.setOnMouseClicked(event -> {
            if(event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 2 && !tablaVideoJuegos.getSelectionModel().isEmpty()){
                videoJuego videoJuegoSeleccionado = tablaVideoJuegos.getSelectionModel().getSelectedItem();
                mostrarDetallesLibro(videoJuegoSeleccionado,primaryStage);
            }
        });

        // 4. Inicializar la lista filtrada y vincularla a la tabla
        datosFiltrados = new FilteredList<>(datosOriginales, p -> true);
        tablaVideoJuegos.setItems(datosFiltrados);

        // 5. Controles de búsqueda
        campoBusqueda = new TextField();
        campoBusqueda.setPromptText("Buscar por título o autor...");
        Button botonBuscar = new Button("Buscar");
        botonBuscar.setOnAction(e -> actualizarFiltros());
        campoBusqueda.setOnAction(e -> actualizarFiltros());

        // 6. Filtros de género
        HBox filtrosGenero = new HBox(10);
        List<String> generosUnicos = Arrays.asList("Fantasía", "Misterio", "Aventura", "Horror");
        for (String genero : generosUnicos) {
            //crear un nuevo checkbox por cada genero existente
            CheckBox checkBox = new CheckBox(genero);
            checkBox.selectedProperty().addListener((obs, oldVal, newVal) -> actualizarFiltros());
            checkBoxesGeneros.add(checkBox);
            filtrosGenero.getChildren().add(checkBox);
        }

        // 7. Filtros de año de publicación
        HBox filtrosAnio = new HBox(10);

        //Obtener los años únicos y ordenados de la lista de videoJuegos
        Set<Integer> conjuntoAnios = datosOriginales.stream()
                .map(videoJuego::getAnioLanzamiento)
                .collect(Collectors.toCollection(TreeSet::new));
        aniosDisponibles = new ArrayList<>(conjuntoAnios);

        comboAnioInicio = new ComboBox<>();
        comboAnioInicio.getItems().add(null);
        comboAnioInicio.getItems().addAll(aniosDisponibles);
        comboAnioInicio.setPromptText("Año inicio");

        comboAnioFin = new ComboBox<>();
        comboAnioFin.getItems().add(null);
        comboAnioFin.getItems().addAll(aniosDisponibles);
        comboAnioFin.setPromptText("Año fin");

        Button botonFiltrarAnio = new Button("Filtrar por Año");
        botonFiltrarAnio.setOnAction(e->actualizarFiltros());

        filtrosAnio.getChildren().addAll(new Label("Rango de Años:"), comboAnioInicio, comboAnioFin, botonFiltrarAnio);

        // Listener para actualizar el combo box de fin cuando cambia el de inicio
        comboAnioInicio.valueProperty().addListener((obs, oldVal, newVal) -> {
            Integer anioFinActual = comboAnioFin.getValue(); // Guardar la selección actual

            //limpiar y repoblar el comboBox de fin
            comboAnioFin.getItems().clear();
            comboAnioFin.getItems().add(null);

            if(newVal != null){
                //Si el año de inicio es un año puntual, agregar el año fin solo los años mayores o iguales al de inicio
                for(Integer anio:aniosDisponibles){
                    if(anio >= newVal){
                        comboAnioFin.getItems().add(anio);
                    }
                }
                //Si el año de fin actual es anterior al nuevo año de inicio, lo reseteamos
                if(anioFinActual != null && anioFinActual < newVal){
                    comboAnioFin.setValue(null);
                }
            } else {
                //Si el año de inicio es NULL, agregamos nuevamente todos los años
                comboAnioFin.getItems().addAll(aniosDisponibles);
            }
        });

        //Tarea

        campoFiltroId = new TextField();
        campoFiltroId.setPromptText("Ingrese ID");
        Button botonfiltroId = new Button("Buscar");
        botonfiltroId.setOnAction(e -> actualizarFiltros());
        campoFiltroId.setOnAction(e -> actualizarFiltros());



        // 8. Botón de reseteo
        Button botonReset = new Button("Resetear Filtros");
        botonReset.setOnAction(e -> resetearFiltros());

        // 9. Crear un contenedor VBox para todos los controles de filtro
        VBox contenedorFiltros = new VBox(10);
        contenedorFiltros.setPadding(new Insets(10));
        contenedorFiltros.getChildren().addAll(
                new HBox(10, new Label("Búsqueda:"), campoBusqueda, botonBuscar),
                new HBox(10, new Label("Búsqueda por Id:"), campoFiltroId, botonfiltroId),
                new Label("Géneros:"), filtrosGenero,
                filtrosAnio, botonReset

        );

        // 10. Crear el TitledPane y establecer el VBox como su contenido
        TitledPane titledPaneFiltros = new TitledPane("Filtros", contenedorFiltros);
        // TODO: configurar TitledPane

        // 11. Configurar el layout principal
        VBox root = new VBox(10, titledPaneFiltros, tablaVideoJuegos);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 750, 450);

        primaryStage.setTitle("Ejemplo de TableView con Filtros");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void actualizarFiltros() {
        //Lógica de filtro por género
        List<String> generosSeleccionados = checkBoxesGeneros.stream()
                .filter(CheckBox::isSelected)
                .map(CheckBox::getText)
                .toList();

        // Lógica de filtro por año
        Integer anioInicio = comboAnioInicio.getValue();
        Integer anioFin = comboAnioFin.getValue();

        datosFiltrados.setPredicate(videoJuego -> {
            // Predicado 1: Búsqueda difusa por título o autor
            String textoBusqueda = campoBusqueda.getText().toLowerCase();
            boolean coincideBusqueda =
                    textoBusqueda.isEmpty() || videoJuego.getTitulo().toLowerCase().contains(textoBusqueda)
                            || videoJuego.getCompañiaDesarrolladora().toLowerCase().contains(textoBusqueda);

            // Predicado 2: Filtrado por género (lógica "AND")
            boolean coincideGenero = generosSeleccionados.isEmpty() || videoJuego.getGeneros()
                    .containsAll(generosSeleccionados);

            // Predicado 3: Filtrado por rango de años
            boolean coincideAnio = true;
            if(anioInicio != null && anioFin != null){
                coincideAnio = videoJuego.getAnioLanzamiento() >= anioInicio && videoJuego.getAnioLanzamiento() <= anioFin;
            } else if (anioInicio != null){
                coincideAnio = videoJuego.getAnioLanzamiento() >= anioInicio;
            } else if (anioFin != null){
                coincideAnio = videoJuego.getAnioLanzamiento() <= anioFin;
            }

            //Predicado 4: Filtro por id en adelante
            String textoId = campoFiltroId.getText().trim();
            boolean coincideId =
                    textoId.isEmpty() || videoJuego.getId() >= Integer.parseInt(textoId);

            return coincideBusqueda && coincideGenero && coincideAnio && coincideId;
        });
    }

    /**
     * Resetea todos los filtros de la interfaz a su estado inicial.
     */
    private void resetearFiltros() {
        // 1. Borrar el texto del campo de búsqueda
        campoBusqueda.clear();

        // 2. Deseleccionar todos los checkboxes de género
        for(CheckBox cb : checkBoxesGeneros){
            cb.setSelected(false);
        }

        // 3. Limpiar la selección de los combo boxes de años
        comboAnioInicio.setValue(null);
        comboAnioFin.setValue(null);


        // 4. Volver a aplicar los filtros para mostrar todos los videoJuegos
        actualizarFiltros();
    }

    private void mostrarDetallesLibro(videoJuego videoJuego, Stage ownerStage) {
        Stage ventanaModal = new Stage();
        ventanaModal.initModality(Modality.APPLICATION_MODAL);
        ventanaModal.initOwner(ownerStage);
        ventanaModal.setTitle("Detalles del Video Juego");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(15));
        layout.setAlignment(Pos.CENTER_LEFT);

        // crear etiquetas para cada datos de videoJuego seleccionado
        Label jgId = new Label("ID: "+ videoJuego.getId());
        Label jgTitulo = new Label("Titulo: "+ videoJuego.getTitulo());
        Label jgCompania = new Label("Compañia Desarrolladora: "+ videoJuego.getCompañiaDesarrolladora());
        Label jgGeneros = new Label("Generos: "+ String.join(", ", videoJuego.getGeneros()));
        Label jgAnioPublicacion = new Label("Año de Publicacion: "+ videoJuego.getAnioLanzamiento());


        Button btnCerrar = new Button("Cerrar");
        btnCerrar.setOnAction(e -> ventanaModal.close());

        //agregar elementos al layout de la ventana
        layout.getChildren().addAll(jgId,jgTitulo,jgCompania,jgGeneros,jgAnioPublicacion,btnCerrar);

        Scene scene = new Scene(layout, 350, 250);
        ventanaModal.setScene(scene);
        ventanaModal.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

