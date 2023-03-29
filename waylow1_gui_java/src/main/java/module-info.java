module gui.java {
    requires javafx.controls;
    requires javafx.fxml;

    opens gui.java to javafx.fxml;
    exports gui.java;
}
