module com.example.stoktakip2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stoktakip2 to javafx.fxml;
    exports com.example.stoktakip2;
}