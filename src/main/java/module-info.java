module Gunn {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens gunn.god_person_creator to javafx.fxml;
    exports gunn.god_person_creator;
}