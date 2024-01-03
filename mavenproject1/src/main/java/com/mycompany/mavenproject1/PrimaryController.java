package com.mycompany.mavenproject1;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class PrimaryController implements Initializable {

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
        
    }
    
    public void inicializarArray(){
        
    }
    
  
}
