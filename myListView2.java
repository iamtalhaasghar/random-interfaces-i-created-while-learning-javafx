// introduction to List View

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import javafx.geometry.Pos;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.beans.value.ObservableValue;

public class myListView2 extends Application{

	public static void main(String []args){

		launch(args);

	}

	public void start(Stage myStage){


		myStage.setTitle("List View");

		FlowPane rootNode = new FlowPane(10,10);		

		Scene myScene = new Scene(rootNode,300,300);

		myStage.setScene(myScene);

		rootNode.setAlignment(Pos.CENTER);
			
		Label response = new Label("Select a Programming Language :");

		ObservableList <String> language = FXCollections.observableArrayList(
			"Java","Python","C/C++","C#","Perl","Java Script");	

		final ListView <String> langLV = new ListView<>(language);

		langLV.setPrefSize(100,100);


		MultipleSelectionModel <String> lang = langLV.getSelectionModel();

		langLV.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		lang.selectedItemProperty().addListener( (ObservableValue<? extends String> changed,
		String oldValue, String newValue)->{
		
		String selItems = "";
		
		ObservableList<String> selected =
 		
		langLV.getSelectionModel().getSelectedItems();
			
		for(int i=0; i < selected.size(); i++)
 			selItems += "\n " + selected.get(i);
 		
		response.setText("All transports selected: " + selItems);

		}
		);				

                rootNode.getChildren().addAll(langLV,response);
		myStage.show();
		

	}
}