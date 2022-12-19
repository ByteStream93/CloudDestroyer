module clouddestroyer.clouddestroyer {
    requires javafx.controls;
    requires javafx.fxml;


    opens clouddestroyer.clouddestroyer to javafx.fxml;
    exports clouddestroyer.clouddestroyer;
}