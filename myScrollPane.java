// introducing how to use a ScrollPane with a node.
// 

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;

import javafx.scene.control.*;
import javafx.event.ActionEvent;


import javafx.geometry.Pos;

public class myScrollPane extends Application{

	public static void main(String []args){
		
		launch();
	
	}

	public void start(Stage myStage){

		myStage.setTitle("Scroll Pane");
		
		FlowPane rootNode = new FlowPane(10,10);
		Scene myScene = new Scene(rootNode,200,200);

		Label message = new Label(
			"A ScrollPane streamlines the process of\n" +
			"adding scroll bars to a window whose\n" +
 			"contents exceed the window's dimensions.\n" +
			 "It also enables a control to fit in a\n" +
 			"smaller space than it otherwise would.\n" +
			 "As such, it often provides a superior\n" +
 			"approach over using individual scroll bars."

		);

		ScrollPane scroll = new ScrollPane(message);

		scroll.setPrefViewportHeight(80);
		scroll.setPrefViewportWidth(130);
		
		scroll.setPannable(true);

		

		Button resetButton = new Button("Reset");

		resetButton.setOnAction((ActionEvent ae) -> {
 			 scroll.setVvalue(0);
			 scroll.setHvalue(0);
 		});

		myStage.setScene(myScene);
		rootNode.getChildren().addAll(message,scroll,resetButton);
		rootNode.setAlignment(Pos.CENTER);
		myStage.show();


	}
}


