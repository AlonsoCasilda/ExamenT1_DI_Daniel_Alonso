package application;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlRocket {
	
	@FXML
	private AnchorPane root, rootHome;
	@FXML
	private ImageView ImagenLog;

	public void initialize() {

		slideFoto();

	}
	/**
	 * Close method
	 */
	@FXML
	public void closeApp() {
		Stage thisStage = (Stage) rootHome.getScene().getWindow();
		thisStage.close();
	}
	
	/**
	 * Open new window
	 */
	@FXML	
	public void openStage() {
		Stage thisStage = (Stage) root.getScene().getWindow();
		thisStage.close();
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Urano.fxml"));
			AnchorPane root = (AnchorPane) loader.load();//carga Anchor
			Scene scene = new Scene(root, 600, 500);//dimensiones
			Stage stage = new Stage();
			stage.setTitle("Segunda Ventana");//titulo de ventana
			stage.setScene(scene);
			
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Transition method
	 */
	
	private void slideFoto() {
		FadeTransition ft = new FadeTransition(Duration.seconds(5), ImagenLog);
		ft.setFromValue(0);
		ft.setToValue(1);
		ft.play();
	}


}
