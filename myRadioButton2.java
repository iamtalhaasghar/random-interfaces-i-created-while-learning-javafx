import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;


import javafx.geometry.Pos;

import javafx.beans.value.ChangeListener;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.beans.value.ObservableValue;

import javafx.event.ActionEvent;

public class myRadioButton2 extends Application{

	Label message;

	public static void main(String []args){

		launch(args);
	}

	public void start (Stage myStage){

		myStage.setTitle("Radio Button");

		FlowPane rootNode = new FlowPane(10,10);
		
		Scene myScene = new Scene(rootNode,500,500);

		myStage.setScene(myScene);
	
		message = new Label("");

		

		
		RadioButton java = new RadioButton("Java");
		RadioButton cpp = new RadioButton("C++");
		RadioButton cs = new RadioButton("C#");
	
		ToggleGroup options = new ToggleGroup();

		java.setToggleGroup(options);
		cpp.setToggleGroup(options);
		cs.setToggleGroup(options);


		options.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> 
		changed, Toggle oldVal, Toggle newVal)  -> {
			
		
                    RadioButton rb = (RadioButton) newVal;
                
                   message.setText("Transport selected is " + rb.getText());

		}
		);

		java.setSelected(true);

		rootNode.getChildren().addAll(java,cpp,cs,message);
		rootNode.setAlignment(Pos.CENTER);


		myStage.show();

	}


}
