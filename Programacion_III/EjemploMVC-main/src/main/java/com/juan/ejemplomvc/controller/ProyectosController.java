package com.juan.ejemplomvc.controller;

import com.juan.ejemplomvc.model.Proyecto;
import com.juan.ejemplomvc.model.ProyectoDAO;
import com.juan.ejemplomvc.model.Tarea;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ProyectosController {

    @FXML
    private TableView<Proyecto> proyectosTable;
    @FXML
    private TableColumn<Proyecto, Integer> proyectoIdColumn;
    @FXML
    private TableColumn<Proyecto, String> proyectoNombreColumn;

    @FXML
    private TableView<Tarea> tareasTable;
    @FXML
    private TableColumn<Tarea, Integer> tareaIdColumn;
    @FXML
    private TableColumn<Tarea, String> tareaDescripcionColumn;

    private ProyectoDAO proyectoDAO;

    public ProyectosController() {
        this.proyectoDAO = new ProyectoDAO();
    }

    @FXML
    private void initialize() {
        // TODO: tareas iniciales
    }

    public void cargarProyectos() {
        // TODO: cargar proyectos
    }

    private void mostrarTareasDelProyecto(Proyecto proyecto) {
        // TODO: mostrar tareas del proyecto
    }

    @FXML
    private void handleCrearProyecto() {
        // TODO: mostrar ventana para crear proyecto
    }
}