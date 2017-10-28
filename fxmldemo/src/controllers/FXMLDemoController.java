package controllers;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.MonsterAttack;

public class FXMLDemoController {
   @FXML private Text results;
   @FXML private TextField nameField;
   @FXML private TextField locationField;
   @FXML private TextField damagesField;
   
   private List<MonsterAttack> attacks = new ArrayList<MonsterAttack>();
   
   @FXML protected void handleSubmitButtonAction(ActionEvent event) {
	   String name = nameField.getText();
	   String location = locationField.getText();
	   double damages = Double.parseDouble(damagesField.getText());
	   
	   MonsterAttack m = new MonsterAttack(name, location, damages);
	   attacks.add(m);
	   String s = generateListOutput();
	   results.setText(s); 
   }

   private String generateListOutput(){
	   StringBuilder sb = new StringBuilder();
	   for (MonsterAttack m: attacks) sb.append(m.toString() + '\n');
	   return sb.toString();
	   
	    
   }
}