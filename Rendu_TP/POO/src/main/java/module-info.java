module fr.angers.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires javafx.graphics;

    opens fr.angers.poo to javafx.fxml;
    exports fr.angers.poo;
    exports fr.angers.poo.volaille;
    opens fr.angers.poo.volaille to javafx.fxml;
}