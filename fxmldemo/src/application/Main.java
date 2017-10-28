package application;


//https://docs.oracle.com/javafx/2/get_started/fxml_tutorial.htm	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("../ui/fxmldemo.fxml"));

		Scene scene = new Scene(root, 600, 275);
		scene.getStylesheets().add("application/application.css");
		stage.setTitle("Monster Attack Monitor");
		stage.setScene(scene);
		stage.show();  
	}

	public static void main(String[] args) {
		launch(args);
	}
}