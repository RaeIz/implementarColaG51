/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import datos.Carro;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;
import modelo.Cola;

/**
 *
 * @author Alejo-PC
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label edadTXT;
    @FXML
    private Label timeTXT;
    @FXML
    private Label timeTransTXT;
    @FXML
    private Label reportTXT;
    @FXML
    private MenuBar menuTXT;
    @FXML
    private WebView web1;
    @FXML
    private WebView web2;
    @FXML
    private Button startSetup;
    @FXML
    private Button finishSetup;
    @FXML
    private TextArea textAreaTXT;

    @FXML
    private void startSetup(ActionEvent event) {
          
    }
    
    @FXML
    private void finishSetup(ActionEvent event) {
          
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

}
