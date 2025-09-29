module com.leandromuzalski1843.tableviewvideojuegos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.leandromuzalski1843.tableviewvideojuegos to javafx.fxml;
    exports com.leandromuzalski1843.tableviewvideojuegos;
}