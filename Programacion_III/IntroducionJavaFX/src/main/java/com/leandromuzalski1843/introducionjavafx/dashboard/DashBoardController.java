package com.leandromuzalski1843.introducionjavafx.dashboard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.lang.classfile.Label;

public class DashBoardController {
    @FXML
    private Label labConteido;

    public void clickInicio(ActionEvent actionEvent){
        labContenido.setText("Estas en la pagina inicio");
    }
    public void clickVantana(ActionEvent actionEvent){
        labContenido.setText("Estas en la pagina ventas");
    }
    public void clickAjustes(ActionEvent actionEvent){
        labContenido.setText("Estas en la pagina Ajustes");
    }

}
