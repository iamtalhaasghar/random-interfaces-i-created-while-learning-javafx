import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;


import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;

public class myToggleButton extends Application{

	public void start (Stage myStage){
		
		myStage.setTitle("Toggle Button");
		FlowPane rootNode = new FlowPane(10,10);

		Scene myScene = new Scene(rootNode,500,500);

		myStage.setScene(myScene);

		Label myLabel= new Label("");
	
		ToggleButton myButton = new ToggleButton("On/Off");

		myButton.setOnAction( (ae) ->
		{
			if(myButton.isSelected())
				myLabel.setText("The button is ON");
			else
				myLabel.setText("The button is OFF");
		}
		);
	
		rootNode.getChildren().addAll(myButton,myLabel);
		rootNode.setAlignment(Pos.CENTER);

		myStage.show();


	}
	
	public static void main(String []args){
		
		launch(args);

	};


}