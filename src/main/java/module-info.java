module com.example.multiscenedemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.multiscenedemo to javafx.fxml;
    exports com.example.multiscenedemo;
}