module com.example.modul6easy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modul6easy to javafx.fxml;
    exports com.example.modul6easy;
}