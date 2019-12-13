package application;

import com.jfoenix.controls.JFXButton;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;


public class ControlUrano {
	
	private boolean go;
	
	@FXML
	private AnchorPane ventana2, menu;
	
	@FXML
	private JFXButton botonHaceAlgo;
	
	public void initialize() {
		closePanel();
		go = true;
	}
	
	/**
	 * Delete Menu slide left
	 * @return no return
	 */
	public void closePanel() {
		TranslateTransition eliminar = new TranslateTransition(Duration.seconds(0.2), menu);
		eliminar.setByX(-600);
		eliminar.play();
	}
	
	/**
	 * See the boolean state menu
	 * @return no
	 */
	public void visualizarPanelMenu() {
		if (!go) {
			closePanel();
			go = true;
			
		} else {
			TranslateTransition visualizar = new TranslateTransition(Duration.seconds(1), menu);
			visualizar.setByX(600);
			visualizar.play();
			go = false;
			}
	}
	
	public void hover() {
		botonHaceAlgo.setStyle("-fx-background-color: black");
	}
	
	
	/**
	 * Accept background to yellow
	 * @return no
	 */
	public void unHover() {
		botonHaceAlgo.setStyle("-fx-background-color: #ffff00");
	}
	
	/**
	 * Click to exit
	 * @return no
	 */
	public void salir() {
		System.exit(0);
	}
}	
