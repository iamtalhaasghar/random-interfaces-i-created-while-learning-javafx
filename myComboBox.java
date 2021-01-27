// introduction to combo box


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.*;

import javafx.geometry.Pos;

import javafx.collections.*;

import javafx.event.ActionEvent;

public class myComboBox extends Application{

	public static void mian(String []args){
	
		launch(args);
		

	}

	public void start (Stage myStage){

		myStage.setTitle("Combo Box");
		
		FlowPane rootNode = new FlowPane(10,10);

		Scene myScene = new Scene(rootNode,500,500);

		rootNode.setAlignment(Pos.CENTER);

		Label heading = new Label("Programming Langues");
		
		Label response = new Label("");
		
		ObservableList<String> lang = FXCollections.observableArrayList(
				"Java","Python","C","C++","C#");

		ComboBox <String> langCombo = new ComboBox<>(lang);

		langCombo.setValue("Select a language...");

		langCombo.setEditable(true);

		response.setText("You selected "+ langCombo.getValue());


		langCombo.setOnAction((ActionEvent ae) -> {
		
			response.setText("You selected "+ langCombo.getValue());							

		});

		myStage.setScene(myScene);
		rootNode.getChildren().addAll(heading,langCombo,response);
		myStage.show();


	}


}