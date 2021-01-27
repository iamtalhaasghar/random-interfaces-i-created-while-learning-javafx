import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;

public class myJLabelP extends Application{

	public static void main(String []args){
		
		launch(args);
	
	}

	public void start(Stage myStage){
		
		myStage.setTitle("Java Label Graphics");

		FlowPane rootNode = new FlowPane();

		Scene myScene = new Scene(rootNode,500,500);

		myStage.setScene(myScene);

		Image Java = new Image("java.png");
		Image C = new Image("C++.png");

		ImageView JavaPic = new ImageView(Java);
		ImageView CPic = new ImageView(C);

		Label JLabel = new Label(" Java ",JavaPic);
		Label CLabel = new Label(" C++ ",CPic);


		rootNode.getChildren().addAll(JLabel,CLabel);

		rootNode.setAlignment(Pos.CENTER);
	
		myStage.show();
		


	}

}