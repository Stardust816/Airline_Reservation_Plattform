module com.example.airplanes {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.airplanes to javafx.fxml;
    exports com.example.airplanes;
}