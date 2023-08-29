/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
import datos.Carro;
import datos.receptor;
import datos.Tools;
import java.time.Duration;
import modelo.Cola;
import modelo.Base;
import modelo.OperacionesCola;
import java.util.UUID;
import java.util.ArrayList;
import java.util.LinkedList;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;

/**
 *
 * @author Alejo-PC
 */
public class FXMLDocumentController implements Initializable {

    Cola<Carro> colaCarros = new Cola<>();

    Cola<receptor> colaReceptor = new Cola<>();

    @FXML
    private Label nombreTXT;
    @FXML
    private Label timeTXT;
    @FXML
    private Label timeTransTXT;
    @FXML
    private Label reportTXT;
    @FXML
    private MenuBar menuTXT;
    @FXML
    private Button startSetup;
    @FXML
    private Button finishSetup;
    @FXML
    private TextArea textAreaTXT;

    private void startSetup(ActionEvent event) {

    }

    @FXML
    private void finishSetup(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        colaCarros = new Cola<>();
//        receptores = new Cola<>();
//        for(int i= 0; i <= 5; i++)
//        {
//            
//        }
//        System.out.println(receptores.toString());
//        t = new Timeline(new KeyFrame(Duration.millis(1000)), 
//                new EventHandler<ActionEvent>(){
//            @Override
//            public void handle(ActionEvent event){
//                funcionArbol();
//            }
//        });   
    }
//        t.setCyclecount(Animation.INDEFINITE);
//        
//        webEngineCola = webCola.getEngine();
//        webEngineCajeros = webCajeros.getEngine();
    //necesitamos esto?
    private boolean verificarCajerosLibres() {
        return true;
    }

    private void crearCarros() {

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

    //prueba de receptor 
    private void crearReceptor() {
        //lim es el numero limite de receptroes 
        int lim = 4;

        //este loop deberia generar revisiones por parte del receptor de manera infinita 
        while (true) {
            
            Carro carroAAtender = colaCarros.desencolar();
            int tiempoLanC = carroAAtender.getTiempoLanC();
            //crea un loop como el de crear carro para ajustar los valores del receptro 
            for (int i = 0; i <= lim; i++) {
                //es similar al tiempo random de carro, despues de todo se deben comparar y se define
                //libre haciendo referencia a cuando esta libre el receptro 
                int libre = (int) (Math.random() * (5 - 1 + 1) + 1);
                boolean t = false;

                if (libre == tiempoLanC) {
                    t = true;
                    receptor nuevoReceptor = new receptor(t, carroAAtender, libre);
                } else {
                    break;
                }
            }
            try {
                Thread.sleep(1000*tiempoLanC); // Espera 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void funcionArbol() {
        crearCarros();
        crearReceptor();
        verificarCajerosLibres();
//        tiempoTotal++;
//        webCola.loadContent(convertirColaAHtml());
//        webCajeros.loadContent(hacerHtmlCajero());

    }
}
