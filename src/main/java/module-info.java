module com.example.ondrous {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ondrous to javafx.fxml;
    exports com.example.ondrous;
}