package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * Mostramos un login, abre otra ventana con el boton
 * @author Daniel Alonso Casilda
 * @version 1.0
 * @see ControlRocket
 */
public class MainRocket extends Application {
	/**
	 * Start method
	 */
	@Override
	public void start(Stage primaryStage) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Mars.fxml"));//cargar la vista
			//BorderPane root = new BorderPane(); //panel
			AnchorPane root = (AnchorPane) loader.load();//Creamos esta linea xq tenemos un anchor, no un border
			Scene scene = new Scene(root, 600, 500);//Se mete el panel dentro de una escenadimensiones ventana principal
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);//Y la escena la metemos en el stage
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
