package main;

import controleur.ControleurConception;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	private BorderPane root;
	private ControleurConception controleurConception;

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/tp2_fxml/vue/Vue.fxml"));

			root = (BorderPane) loader.load();

			controleurConception = (ControleurConception) loader.getController();

			Scene scene = new Scene(root);

			primaryStage.setScene(scene);
			primaryStage.setTitle("Déplacer forme");
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

}
