package com.leandromuzalski1843.introducionjavafx.dashboard;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DashBoardAplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Cargar el archivo FxML del dashboard
        FXMLLoader louder = new FXMLLoader(DashBoardAplication.class.getResource("dashboard.fxml"));

        //Crear una escena con el contenido del archivo
        Scene escena = new Scene(louder.load(), 950, 600);

        //Configurar el titulo de la ventana
        stage.setTitle("Dashboard");

        //Establecer la escena dentro de la ventana (Stage)
        stage.setScene(escena);

        //Mostrar la ventana
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}