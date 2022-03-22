package it.polito.tdp.alien;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	LinkedHashMap<String, Parola> mappaParole = new LinkedHashMap<>();
	
    @FXML
    private Button btnClear;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtArea;

    @FXML
    private TextField txtParole;

    @FXML
    void handleTranslate(ActionEvent event) {
    	txtArea.clear();
    	
    	if (txtParole.getText().contains(" ")) {
    		String[] vett_parole = txtParole.getText().split(" ");
    		String parolaAliena = vett_parole[0];
    		String parolaTradotta = vett_parole[1];
    		
    		if (parolaAliena.matches("[a-zA-Z]+") && parolaTradotta.matches("[a-zA-Z]+")) {
    			//continuo
    			if (mappaParole.containsKey(parolaAliena.toLowerCase())) {
    				mappaParole.get(parolaAliena).listaTraduzioni.add(parolaTradotta);
    			}
    			else {
    				Parola nuovaParola = new Parola(parolaAliena);
    				nuovaParola.listaTraduzioni.add(parolaTradotta);
    				mappaParole.put(parolaAliena, nuovaParola);
    			}
    		}
    		else {
    			txtArea.setText("Parola non ammessa.");
    		}
    	}//fine aggiunta nuove parole
    	else {
    		if (txtParole.getText().matches("[a-zA-Z]+")) {
    			if (mappaParole.containsKey(txtParole.getText().toLowerCase())) {
    				String stringastampa = mappaParole.get(txtParole.getText().toLowerCase()).stampaLista();
    				txtArea.setText(stringastampa);
    			}
    			else {
    				txtArea.setText("Parola non esistente.");
    			}
    		}
    		else {
    			txtArea.setText("Parola non ammessa.");
    		}
    		
    		
    		
    		
    	}
    	
    	
    	
    	
    	
    	
    	
    }
    
    @FXML
    void handleClear(ActionEvent event) {

    }



}
