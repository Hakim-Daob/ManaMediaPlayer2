package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Player player = new Player("file:///D:S.mp4");
		Scene scene= new Scene(player,1080, 480, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();			
		}
	public void starts(Stage primaryStage) {
		Player player = new Player("file:///D:S.mp4");
		Scene scene= new Scene(player,1080, 480, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();			
		}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
