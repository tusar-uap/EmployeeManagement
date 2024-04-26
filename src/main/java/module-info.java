module com.uap.employeemanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uap.application to javafx.fxml;
    exports com.uap.application;
}