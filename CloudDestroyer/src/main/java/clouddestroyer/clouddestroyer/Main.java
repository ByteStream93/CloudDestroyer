package clouddestroyer.clouddestroyer;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static GraphicsContext graphicsContext;
    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();
        Scene gameScene = new Scene(group);
        Canvas gameCanvas = new Canvas(1200,800);
        group.getChildren().add(gameCanvas);
        graphicsContext = gameCanvas.getGraphicsContext2D();

        primaryStage.setTitle("Cloud-Destroyer");
        primaryStage.setScene(gameScene);
        primaryStage.show();

        GraphicDesign.gameTick();



    }
}
