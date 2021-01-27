// introducing how to confirm a radio button selection using a push button
// introducing separator

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.ToggleGroup;

import javafx.geometry.Pos;

import javafx.scene.control.Separator;


public class RButtonConfrm extends Application{

	public void start (Stage myStage){

		myStage.setTitle("Radio Button Confirmation");

		FlowPane rootNode = new FlowPane(10,10);		
		
		Scene myScene = new Scene(rootNode,500,500);
	
		rootNode.setAlignment(Pos.CENTER);

		myStage.setScene(myScene);
		

		Label choice = new Label("Select the language in which you are master : ");

		Label response = new Label();

		RadioButton j = new RadioButton("Java");
		RadioButton cp = new RadioButton("C++");
		RadioButton cs = new RadioButton("C#");

		ToggleGroup language = new ToggleGroup();

		j.setToggleGroup(language);
		cp.setToggleGroup(language);
		cs.setToggleGroup(language);

		j.fire();
		
		Separator line = new Separator();
		line.setPrefWidth(50);

		Button answer = new Button("Confirm Selection!");

		answer.setOnAction( (ae) -> 
			{

			RadioButton rb = (RadioButton) language.getSelectedToggle();
			response.setText("You selected : "+rb.getText());
			}						
		);		
		
		


		rootNode.getChildren().addAll(choice,j,cp,cs,line,answer,response);

		myStage.show();

	}

	public static void main(String []args){

	launch(args);

	}

}