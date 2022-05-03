module com.haw.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.haw.test to javafx.fxml;
    exports com.haw.test;
}