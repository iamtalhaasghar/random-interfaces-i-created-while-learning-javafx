// introducing text Field

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import javafx.geometry.Pos;
import javafx.event.ActionEvent;


public class myTextField extends Application{

	public static void main(String []args){


		launch();

	}

	public void start (Stage myStage){

		myStage.setTitle("Text Field");

		FlowPane rootNode = new FlowPane(10,10);

		Scene myScene = new Scene(rootNode,300,300);

		TextField name = new TextField();

		PasswordField pass = new PasswordField();

		pass.setTooltip(new Tooltip("Enter Password"));
		name.setTooltip(new Tooltip("Enter Name"));

		Label response = new Label();

		Button ok = new Button("Enter");

		name.setPromptText("Enter your name");
		
		
		name.setOnAction((ActionEvent ae) ->{

			response.setText(" "+name.getText());

		});

		ok.setOnAction((ActionEvent ae) ->{

			response.setText(" "+name.getText());

		});
	
		pass.setOnAction((ActionEvent ae) ->{

			response.setText(" "+pass.getText());

		});		
		

		rootNode.getChildren().addAll(name,pass,ok,response);

		rootNode.setAlignment(Pos.CENTER);

		myStage.setScene(myScene);
		myStage.show();

	}

}