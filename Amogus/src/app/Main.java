package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
	
	public static Stage stage;
	
	Scene scene;
	
	BorderPane bp;
	VBox vb;
	
	Label titleLbl;
	
	
	public void initComponents() {
		stage = new Stage();
		stage.setTitle("Amogus");
		stage.setResizable(false);
		stage.initStyle(StageStyle.DECORATED);

		bp = new BorderPane();
		vb = new VBox();
		
		titleLbl = new Label("Amongus");
		
		vb.getChildren().add(titleLbl);
		bp.setCenter(vb);
		
		scene = new Scene(bp,500,500);
		
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		initComponents();
		stage.setScene(scene);
		stage.show();
		
	}

}
