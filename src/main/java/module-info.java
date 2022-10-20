module com.example.filmexfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.filmexfx to javafx.fxml;
    exports com.example.filmexfx;
}