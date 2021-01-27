import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import javafx.geometry.Pos;

public class myRadioButton extends Application{

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

		Label Question = new Label("Which is your most favourite Programing Language?");

		
		RadioButton java = new RadioButton("Java");
		RadioButton cpp = new RadioButton("C++");
		RadioButton cs = new RadioButton("C#");
	
		ToggleGroup options = new ToggleGroup();

		java.setToggleGroup(options);
		cpp.setToggleGroup(options);
		cs.setToggleGroup(options);

		java.setOnAction((ae) -> 
		{
			message.setText("Java Really!!! Mine too...");
			Question.setText("");
		}
		);
		cpp.setOnAction((ae) -> 
		{
			message.setText("C++ !!! Good for a classical programmer...");
			Question.setText("");
		}
		);				
		cs.setOnAction((ae) -> 
		{
			message.setText("C# !!! Meant for innovative programmer...");
			Question.setText("");
		}
		);

		//java.fire();

		rootNode.getChildren().addAll(Question,message,java,cpp,cs);
		rootNode.setAlignment(Pos.CENTER);


		myStage.show();

	}


}