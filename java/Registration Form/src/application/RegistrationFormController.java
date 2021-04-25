package application;

import dataclass.Person;
import exceptions.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegistrationFormController {

  @FXML
  private TextField firstNameLabel;

  @FXML
  private TextField lastNameLabel;

  @FXML
  private TextField emailLabel;

  @FXML
  private TextField confirmPasswordLabel;

  @FXML
  private TextField passwordLabel;

  @FXML
  private Button saveLabel;

  @FXML
  private Button clearFormLabel;

  @FXML
  public void clearFormClicked(ActionEvent event) {
    this.resetUI();
  }

  private void resetUI() {
    this.firstNameLabel.setText("");
    this.lastNameLabel.setText("");
    this.emailLabel.setText("");
    this.passwordLabel.setText("");
    this.confirmPasswordLabel.setText("");
  }

  @FXML
  public void saveClicked(ActionEvent event) {

    System.out.println("Button Press");

    String fnl = firstNameLabel.getText();
    System.out.println(fnl);

    String lnl = lastNameLabel.getText();
    System.out.println(lnl);

    String el = emailLabel.getText();
    System.out.println(el);

    String pl = passwordLabel.getText();
    System.out.println(pl);

    String cpl = confirmPasswordLabel.getText();
    System.out.println(cpl);

    try {
      try {
        try {

          Person p1 = new Person(fnl, lnl, el, pl, cpl);
          System.out.println(p1.toString());

          this.resetUI();

        } catch (InvalidPasswordException e) { // TODO Auto-generated catch block
          e.printStackTrace();
        }

      } catch (InvalidEmailException e) { // TODO Auto-generated catch block
        e.printStackTrace();
      }

    } catch (InvalidNameException e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
