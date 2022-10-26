module com.example.login {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    requires com.dlsc.formsfx;
   // requires validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.login to javafx.fxml;
    exports com.example.login;
}