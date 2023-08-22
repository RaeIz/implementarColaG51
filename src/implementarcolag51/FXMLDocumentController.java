/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementarcolag51;

import datos.Persona;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import modelo.Cola;

/**
 *
 * @author Alejo-PC
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label tituloL;
    @FXML
    private Label nombrePL;
    @FXML
    private Label correoPL;
    @FXML
    private Label numPL;

    @FXML
    private TextField nombreTXT;
    @FXML
    private TextField correoTXT;
    @FXML
    private TextField numTXT;
    @FXML
    private TextArea mostrarTAXT;

    Cola<Persona> colaPersonas;

    @FXML
    private void encolarPersonas(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");

        String nombreP = nombreTXT.getText();
        String correoP = correoTXT.getText();
        String numP = numTXT.getText();

        colaPersonas.encolar(new Persona(nombreP, correoP, numP));
    }

     @FXML
    private void mostrarPersonas(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");

        mostrarTAXT.setText(colaPersonas.toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        colaPersonas = new Cola<>();
    }

}
