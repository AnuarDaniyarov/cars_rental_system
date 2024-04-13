module org.example.car_rental {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.car_rental to javafx.fxml;
    exports org.example.car_rental;
}