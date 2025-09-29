package com.juan.ejemplomvc.controller;

import com.juan.ejemplomvc.model.Proyecto;
import com.juan.ejemplomvc.model.ProyectoDAO;
import com.juan.ejemplomvc.model.Tarea;
import com.juan.ejemplomvc.model.TareaDAO;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NuevoProyectoController {

    @FXML
    private TextField nombreProyectoField;
    @FXML
    private CheckBox agregarTareasCheckbox;
    @FXML
    private VBox tareasContainer;
    @FXML
    private TextField tareaField;
    @FXML
    private TableView<String> tareasTable;
    @FXML
    private TableColumn<String, String> tareaDescripcionColumn;

    private ObservableList<String> tareasData = FXCollections.observableArrayList();
    private Stage dialogStage;
    private ProyectosController parentController;

    @FXML
    private void initialize() {
        // TODO: tareas iniciales
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void setParentController(ProyectosController parentController) {
        this.parentController = parentController;
    }

    @FXML
    private void handleAgregarTarea() {
        // TODO: agregar tarea
    }

    @FXML
    private void handleGuardar() {
        // TODO: crear proyecto con sus tareas
    }

    @FXML
    private void handleCancelar() {
        // TODO: cerrar ventana
    }
}