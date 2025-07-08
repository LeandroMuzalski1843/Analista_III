module com.leandromuzalski1843.introducionjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.leandromuzalski1843.introducionjavafx to javafx.fxml;
    exports com.leandromuzalski1843.introducionjavafx;

    opens com.leandromuzalski1843.introducionjavafx.dashboard to javafx.fxml;
    exports com.leandromuzalski1843.introducionjavafx.dashboard;
}