package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RuzzleController {

	List <Label> listaLabel=new ArrayList<Label>();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lb00;

    @FXML
    private Label lb01;

    @FXML
    private Label lb02;

    @FXML
    private Label lb03;

    @FXML
    private Label lb10;

    @FXML
    private Label lb11;

    @FXML
    private Label lb12;

    @FXML
    private Label lb13;

    @FXML
    private Label lb20;

    @FXML
    private Label lb21;

    @FXML
    private Label lb22;

    @FXML
    private Label lb23;

    @FXML
    private Label lb30;

    @FXML
    private Label lb31;

    @FXML
    private Label lb32;

    @FXML
    private Label lb33;

    @FXML
    private Button btnGenera;
    

    @FXML
    void doGenera(ActionEvent event) {
    	Random r = new Random();
    	listaLabel.add(lb00);
    	listaLabel.add(lb01);
    	listaLabel.add(lb02);
    	listaLabel.add(lb03);
    	listaLabel.add(lb10);
    	listaLabel.add(lb11);
    	listaLabel.add(lb12);
    	listaLabel.add(lb13);
    	listaLabel.add(lb20);
    	listaLabel.add(lb21);
    	listaLabel.add(lb22);
    	listaLabel.add(lb23);
    	listaLabel.add(lb30);
    	listaLabel.add(lb31);
    	listaLabel.add(lb32);
    	listaLabel.add(lb33);
    	
    	for(Label l:listaLabel){
    		char c = (char)(r.nextInt(26) + 'a');
        	String s=""+c;
        	l.setText(s);
    	}
    	
    	//algoritmo per ricerca parole dizionario
    	
    	//modificare grafica
    	
    	
    }

    @FXML
    void initialize() {
        assert lb00 != null : "fx:id=\"lb00\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lb01 != null : "fx:id=\"lb01\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lb02 != null : "fx:id=\"lb02\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lb03 != null : "fx:id=\"lb03\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lb10 != null : "fx:id=\"lb10\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lb11 != null : "fx:id=\"lb11\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lb12 != null : "fx:id=\"lb12\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lb13 != null : "fx:id=\"lb13\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lb20 != null : "fx:id=\"lb20\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lb21 != null : "fx:id=\"lb21\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lb22 != null : "fx:id=\"lb22\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lb23 != null : "fx:id=\"lb23\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lb30 != null : "fx:id=\"lb30\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lb31 != null : "fx:id=\"lb31\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lb32 != null : "fx:id=\"lb32\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lb33 != null : "fx:id=\"lb33\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert btnGenera != null : "fx:id=\"btnGenera\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        
    }
}
