module com.example.gamma {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.gamma to javafx.fxml;
    exports com.example.gamma;
}