package gunn.god_person_creator;
/*
Name; Gavin Gunn
Class; Grade 12 Com Studies
Date; 01/12/21
Assignment#; 3
Description; Person controller
 */


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    
    @FXML //exit button
    void exitClick(ActionEvent event) {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
}
