import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;

import javafx.geometry.Pos;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class myButton extends Application{

	Label response;

	public static void main(String []args){

		launch(args);

	}

	public void start(Stage myStage){
		
		myStage.setTitle("Working with Buttons");
		
		FlowPane rootNode = new FlowPane(20,20);

		rootNode.setAlignment(Pos.CENTER);

		Scene myScene = new Scene(rootNode,500,500);

		myStage.setScene(myScene);


		response = new Label("");

		response.setContentDisplay(ContentDisplay.TOP);	

		Label myLabel = new Label("The two most important Programming Languages.");	

		Image J = new Image("java.png");

		Image C = new Image("C++.png");

		ImageView JPic = new ImageView(J);

		ImageView CPic = new ImageView(C);


		Button b1 = new Button("java",JPic);

		Button b2 = new Button("C",CPic);

		b1.setContentDisplay(ContentDisplay.TOP);
		b2.setContentDisplay(ContentDisplay.TOP);

		b1.setOnAction((ae) ->
			{
				response.setText("James Gosling");
				response.setGraphic(new ImageView("JamesGosling.png"));
			}
		);
	


				
		b2.setOnAction((ae) ->
			{
				response.setText("Bjarne Stroustrup");
				response.setGraphic(new ImageView("BjarneStroustrup.png"));



			}
		);
	

		
		rootNode.getChildren().addAll(myLabel,b1,b2,response);

		myStage.show();		


	}


}