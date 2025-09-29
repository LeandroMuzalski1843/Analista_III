package com.juan.ejemplomvc.model;

import com.juan.ejemplomvc.util.Config;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TareaDAO {
    public ObservableList<Tarea> getTareasPorProyectoId(int projectId) {
        // TODO: leer las tareas de un proyecto
    }

    public void guardarTarea(Tarea tarea) {
        // TODO: crear una tarea en la BD
    }
}
