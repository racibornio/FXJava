module com.patryk.fxjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.patryk.fxjava to javafx.fxml;
    exports com.patryk.fxjava;
}