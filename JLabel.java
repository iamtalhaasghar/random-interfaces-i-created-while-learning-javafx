import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

public class JLabel extends Application{

	public static void main(String []args){

		launch(args);


	}

	public void start (Stage myStage){

		myStage.setTitle("Java FX Application");	
		
		FlowPane rootNode = new FlowPane(10,10);

		Label myLabel = new Label("Talha is the best Programmer of KFUEIT.");

		Scene myScene = new Scene(rootNode,500,500);	

		myStage.setScene(myScene);
	
		//rootNode.getChildren().add(myLabel);

		rootNode.setAlignment(Pos.CENTER);		

		myStage.show();

	}


}