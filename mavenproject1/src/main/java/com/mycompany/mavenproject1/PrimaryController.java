package com.mycompany.mavenproject1;

import java.io.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class PrimaryController implements Initializable {

    String archivo = "com.mycompany.mavenproject1/archivo.txt";
    @FXML
    private BorderPane mainContainer;
    @FXML
    private VBox cancionesContainer;
    private ArrayList<Cancion> canciones=new ArrayList();

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //canciones = inicializarArray(archivo);
        //System.out.println(canciones.toString());
    }
    
    
    public static ArrayList<Cancion> inicializarArray(String archivo){
        ArrayList<Cancion> listaC = new ArrayList<>();
        try(BufferedReader b = new BufferedReader(new FileReader(archivo))){
            String a;
            while((a = b.readLine())!= null){
                String[] x = a.split(";");
                String titulo = x[0];
                String cantante = x[1];
                String imagen = x[2];
                int postActual = Integer.parseInt(x[3]);
                int postPrevia = Integer.parseInt(x[4]);
                int semanas = Integer.parseInt(x[5]);
                String[] y = x[7].split("-");
                ArrayList<Integer> historial = new ArrayList<>();
                for(String v: y){
                   int w = Integer.parseInt(v);
                   historial.add(w);
                }
                Cancion c = new Cancion(titulo,cantante,imagen,postActual,postPrevia,semanas,historial);
                listaC.add(c);
            } 
        }catch(Exception e){
            e.printStackTrace();
        }
        Collections.sort(listaC);
        return listaC;
    }
    
    
    
  
}
