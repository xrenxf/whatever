module com.example.modul6hard {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modul6hard to javafx.fxml;
    exports com.example.modul6hard;
}