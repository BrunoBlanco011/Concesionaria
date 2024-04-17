module com.brunoblanco.concesionariovehiculos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.brunoblanco.concesionariovehiculos to javafx.fxml;
    exports com.brunoblanco.concesionariovehiculos;
    exports Controllers;
    opens Controllers to javafx.fxml;
}