/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import datos.Carro;
import java.net.URL;
import java.util.Random;
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
import datos.Carro;
import java.util.UUID;
import modelo.Cola;
import datos.receptor;
import java.util.ArrayList;

/**
 *
 * @author Alejo-PC
 */
public class FXMLDocumentController implements Initializable {

    Cola<Carro> colaCarros = new Cola<>();

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

    public void crearCarros() {

        while (true) {
            int numeroCarros = (int) (Math.random() * (6 - 1 + 1) - 1); // Genera entre 1 y 6 carros

            for (int i = 0; i < numeroCarros; i++) {
                int elModelo = (int) (Math.random() * (2024 - 2000 + 1) + 2000);
                int elTiempoLan = (int) (Math.random() * (5 - 1 + 1) + 1);
                String elNombre = "David";
                //los de arriba son el generador de carros 

                Carro nuevoCarro = new Carro(elModelo, elNombre, elTiempoLan);
                colaCarros.encolar(nuevoCarro);
            }
            try {
                Thread.sleep(1000); // Espera 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
    // TODO code application logic here        
//           
//    ArrayList<receptor> losReceptores = new ArrayList<>();        
//    //Loop            
//    //formula para generar valores aleatorios con un maximo y minimo 
//        int         
//        int b = (int)(Math.random()*(max-min+1)+min);       
//        int elModelo = (int) (Math.random() * (2024 - 2000 + 1) + 2000);        //por ahora el nombre estara en blanco para confirmar que el loop funciona         
//        String elNombre = "David";        int elTiempoLan = (int) (Math.random() * (5 - 1 + 1) + 1);        
//        colaCarros.encolar(new Carro(elModelo, elNombre, elTiempoLan));

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
