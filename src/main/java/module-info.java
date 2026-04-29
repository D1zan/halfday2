module com.example.halfday2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;


    opens com.example.halfday2 to javafx.fxml;
    exports com.example.halfday2;
}