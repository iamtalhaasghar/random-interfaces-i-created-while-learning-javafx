// demonstrates how to use check box
// also the thirds state of a check box indeterminate state

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.FlowPane;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.event.*;

import javafx.geometry.Pos;

public class myCheckBox extends Application{


	public static void main(String []args){

		launch(args);

	}

	String result = "";

	CheckBox java ;
	CheckBox cp ;
	CheckBox cs ;

	Label output ;

	Label selectedLang ;

	public void start (Stage myStage){
	
		myStage.setTitle("Check Boxes");

		FlowPane rootNode = new FlowPane(10,10);

		Scene myScene = new Scene (rootNode, 200,200);

		Label message = new Label("Which languages do you like : ");

		java = new CheckBox("Java");
		cp = new CheckBox("C++");
		cs = new CheckBox("C#");

		java.setAllowIndeterminate(true);
		cp.setAllowIndeterminate(true);
		cs.setAllowIndeterminate(true);


		output = new Label ("You have selected : <no Option>");
		selectedLang = new Label ("No Language is Selected.");
		
		java.setOnAction( (ae) ->
		{
			if(java.isIndeterminate())
				output.setText("You don`t know how to code in JAVA ");
				
			else if(java.isSelected())		
				output.setText("You have selected  JAVA ");
			else 
				output.setText("You have cleared JAVA ");
			
			showAll();
		
		}
		);

		cp.setOnAction((ae) ->
		{
			if(cp.isIndeterminate())
				output.setText("You don`t know how to code in C++ ");
			else if(cp.isSelected())
				output.setText("You have selected C++ ");
			else 
				output.setText(" You have cleared C++ ");

			showAll();


		}
		);

		cs.setOnAction((ae) ->
		{
			if(cs.isIndeterminate())
				output.setText("You don`t know how to code in C# ");
			else if(cs.isSelected())
				output.setText("You have selected C# ");
			else 
				output.setText("You have cleared C# ");

			showAll();
			

		}
		);	


		rootNode.setAlignment(Pos.CENTER);
		rootNode.getChildren().addAll(message,java,cp,cs,output,selectedLang);
		
		myStage.setScene(myScene);		

		myStage.show();		

		

	}

	public void showAll(){

		result = "";

		if(java.isSelected())
			result += " Java ";
		if(cp.isSelected())
			result += " C++ ";
		if(cs.isSelected())
			result += " C# ";
		if(result.equals(""))
			result = "None";

		selectedLang.setText( "All selected Languages are : "+result);
	}

}