module org.a22ivancp.proyect {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.a22ivancp.proyect to javafx.fxml;
    exports org.a22ivancp.proyect;
}