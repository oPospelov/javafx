package сolculator.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textField;

    SimpleStringProperty inputline = new SimpleStringProperty();

    @FXML
    public void initialize() {
        textField.textProperty().bind(inputline);

        inputline.set("");
    }
    int action = 0;
    int n = 0;
    double c = 0;

    public void signInClicked1(ActionEvent evt) {
        inputline.set(inputline.getValue() + ((Button) evt.getTarget()).textProperty().get());
    }

    public void signInClicked2(ActionEvent evt) {
        inputline.set(inputline.getValue() + ((Button) evt.getTarget()).textProperty().get());
    }

    public void signInClicked3(ActionEvent evt) {
        inputline.set(inputline.getValue() + ((Button) evt.getTarget()).textProperty().get());
    }

    public void signInClicked4(ActionEvent evt) {
        inputline.set(inputline.getValue() + ((Button) evt.getTarget()).textProperty().get());
    }

    public void signInClicked5(ActionEvent evt) {
        inputline.set(inputline.getValue() + ((Button) evt.getTarget()).textProperty().get());
    }

    public void signInClicked6(ActionEvent evt) {
        inputline.set(inputline.getValue() + ((Button) evt.getTarget()).textProperty().get());
    }

    public void signInClicked7(ActionEvent evt) {
        inputline.set(inputline.getValue() + ((Button) evt.getTarget()).textProperty().get());
    }

    public void signInClicked8(ActionEvent evt) {
        inputline.set(inputline.getValue() + ((Button) evt.getTarget()).textProperty().get());
    }

    public void signInClicked9(ActionEvent evt) {
        inputline.set(inputline.getValue() + ((Button) evt.getTarget()).textProperty().get());
    }

    public void signInClicked0(ActionEvent evt) {
        inputline.set(inputline.getValue() + ((Button) evt.getTarget()).textProperty().get());
    }

    public void signInClickedplus(ActionEvent evt) {
        inputline.set(inputline.getValue() + ((Button) evt.getTarget()).textProperty().get());
        action = 1;
    }

    public void signInClickedminus(ActionEvent evt) {
        inputline.set(inputline.getValue() + ((Button) evt.getTarget()).textProperty().get());
        action = 2;
    }

    public void signInClickedmultiply(ActionEvent evt) {
        inputline.set(inputline.getValue() + ((Button) evt.getTarget()).textProperty().get());
        action = 3;
    }

    public void signInClickedshare(ActionEvent evt) {
        inputline.set(inputline.getValue() + ((Button) evt.getTarget()).textProperty().get());
        action = 4;
    }

    public void signInClickedequally(ActionEvent evt) {
        String s = inputline.getValue();
        switch (action){
            case 1:  n = s.indexOf("+");
                break;
            case 2:  n = s.indexOf("-");
                break;
            case 3:  n = s.indexOf("x");
                break;
            case 4:  n = s.indexOf("/");
                break;
        }

        String s1 = s.substring(0, n);
        String s2 = s.substring(n + 1, s.length());
        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);
        switch (action){
            case 1:  c = a + b;
                break;
            case 2:  c = a - b;
                break;
            case 3:  c = a * b;
                break;
            case 4:  c = a / b;
                break;
        }

        String s3 = Double.toString(c);
        inputline.set(s3);}


    public void signInClickedpoint(ActionEvent evt) {
        inputline.set(inputline.getValue() + ((Button) evt.getTarget()).textProperty().get());
    }
}


