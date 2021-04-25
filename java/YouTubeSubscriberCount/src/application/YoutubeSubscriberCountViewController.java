package application;

import javafx.event.ActionEvent;

/**
 * Sample Skeleton for 'YoutubeSubscriberCountView.fxml' Controller Class
 */

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class YoutubeSubscriberCountViewController {

    @FXML // fx:id="fnameLabel"
    private TextField fnameLabel; // Value injected by FXMLLoader

    @FXML // fx:id="lnameLabel"
    private TextField lnameLabel; // Value injected by FXMLLoader

    @FXML // fx:id="yChannelNameLabel"
    private TextField yChannelNameLabel; // Value injected by FXMLLoader

    @FXML // fx:id="channelDateLabel"
    private DatePicker channelDateLabel; // Value injected by FXMLLoader

    @FXML // fx:id="subCountLabel"
    private TextField subCountLabel; // Value injected by FXMLLoader

    @FXML // fx:id="chooseAvaterLabel"
    private Button chooseAvaterLabel; // Value injected by FXMLLoader

    @FXML // fx:id="saveLabel"
    private Button saveLabel; // Value injected by FXMLLoader

    @FXML // fx:id="clearFormLabel"
    private Button clearFormLabel; // Value injected by FXMLLoader

    @FXML // fx:id="imageViewLabel"
    private ImageView imageViewLabel; // Value injected by FXMLLoader
    
    
    

    @FXML
    public void handleChannelDateLabel(ActionEvent event) {

    }

    @FXML
    public void handleChannelDateLabelClicked(MouseEvent event) {

    }

    @FXML
    public void handleChooseAvaterLabel(ActionEvent event) {

    }

    @FXML
    public void handleChooseAvaterLabelClicked(MouseEvent event) {
      FileChooser fileChooser= new FileChooser();
      Stage primaryStage =(Stage)this.handleChooseAvaterLabel.getScene().getWindow();
      File slectedFile = fileChooser.showOpenDialog(primaryStage);

    }

    @FXML
    public void handleClearFormLabel(ActionEvent event) {

    }

    @FXML
    public void handleSaveLabel(ActionEvent event) {

    }

}
