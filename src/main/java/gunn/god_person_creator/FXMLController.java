package gunn.god_person_creator;

/*
Name; Gavin Gunn
Class; Grade 12 Com Studies
Date; 01/12/21
Assignment#; 3
Description; Person controller
 */
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FXMLController implements Initializable {

    @FXML
    private Button btnUpdate, btnPersonEdit;

    @FXML
    private AnchorPane apnWall;

    @FXML
    private Label lblgameBrain;

    @FXML
    private ListView lstBox;

    @FXML
    private TextField txt1, txt2, txt3, txt4, txt5, txt6, txtdevCheck;

    boolean devAccess;

    ArrayList<Person> list = new ArrayList();  //ArrayList of the custom object

    public FXMLController() {
        this.devAccess = false;
    }

    @FXML
    void devClick(ActionEvent event) { //Enters/exits dev mode, various UI changes, access to character editor, password code

        if (txtdevCheck.getText().equals("Kyber") && devAccess == false) {
            apnWall.setStyle("-fx-background-color: #E53935");
            devAccess = true;
            btnPersonEdit.setVisible(true);
            btnUpdate.setVisible(true);
            lblgameBrain.setText("Welcome to developer mode");

        } else if (txtdevCheck.getText().equals("Kyber") && devAccess == true) {
            txtdevCheck.setText("");
            devAccess = false;
            apnWall.setStyle("-fx-background-color: #1B6AC6");
            btnPersonEdit.setVisible(false);
            btnUpdate.setVisible(false);
            lblgameBrain.setText("Developer mode shutdown");
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Developer mode");
            alert.setHeaderText(null);
            alert.setContentText("Access denied");
            alert.showAndWait();
        }

    }

    void listUpdate() { //Updates the listBox
        lstBox.getItems().clear();  //clears the list each time so it can be reset from the arrayList
        for (int i = 0; i < list.size(); i++) {
            lstBox.getItems().add("Name: " + list.get(i).getName() + ", " + "Player Class: " + list.get(i).getClassPlayer() + ", " + "Strength: " + list.get(i).getStrength() + ", " + "Magic: " + list.get(i).getMagic() + ", " + "Intelligence: " + list.get(i).getIntelligence() + ", " + "Speed: " + list.get(i).getSpeed() + " ");  //adds each lock to the listbox with i being arraylist index
        }
    }

    @FXML //Saves characters made
    void saveClick(ActionEvent event) {
        list.add(new Person((txt1.getText()), (txt2.getText()), Integer.parseInt(txt3.getText()), Integer.parseInt(txt4.getText()), Integer.parseInt(txt5.getText()), Integer.parseInt(txt6.getText())));
        listUpdate();
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
    }

    @FXML // Brings up character for edit
    void changeClick(ActionEvent event) {
        int selectedIndex = lstBox.getSelectionModel().getSelectedIndex();
        txt1.setText(list.get(selectedIndex).getName());
        txt2.setText(list.get(selectedIndex).getClassPlayer());
        txt3.setText("" + list.get(selectedIndex).getStrength());
        txt4.setText("" + list.get(selectedIndex).getMagic());
        txt5.setText("" + list.get(selectedIndex).getIntelligence());
        txt6.setText("" + list.get(selectedIndex).getSpeed());
    }

    @FXML //removes and re adds character with updated info
    void updateClick(ActionEvent event) { 
        int selectedIndex = lstBox.getSelectionModel().getSelectedIndex();
        list.remove(selectedIndex);
        list.add(new Person((txt1.getText()), (txt2.getText()), Integer.parseInt(txt3.getText()), Integer.parseInt(txt4.getText()), Integer.parseInt(txt5.getText()), Integer.parseInt(txt6.getText()))); 
        listUpdate();
    }

    @FXML //exit button
    void exitClick(ActionEvent event) {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnPersonEdit.setVisible(false); //invisibilty locked behind dev access
        btnUpdate.setVisible(false);
        
    }
}
