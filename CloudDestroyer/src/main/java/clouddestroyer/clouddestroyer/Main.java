package clouddestroyer.clouddestroyer;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static GraphicsContext graphicsContext;





    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();
        Scene gameScene = new Scene(group);
        Canvas gameCanvas = new Canvas(Table.tableWidth,Table.tableHeight);
        group.getChildren().add(gameCanvas);
        graphicsContext = gameCanvas.getGraphicsContext2D();
        gameScene.setOnKeyPressed(event -> {

            if(PlayerBar.bar.get(0).getPlayerBar_x() > 0) {

            if(KeyCode.LEFT == event.getCode()) {

                for (int i = 0; i < PlayerBar.bar.size(); i++) {

                        PlayerBar.bar.get(i).setPlayerBar_x(PlayerBar.bar.get(i).playerBar_x - 1);
                    }
                }
            }
            if(KeyCode.RIGHT == event.getCode()){

                if(PlayerBar.bar.get(PlayerBar.bar.size()-1).getPlayerBar_x() <= Table.rows) {

                for(int i = 0; i<PlayerBar.bar.size();i++) {

                    PlayerBar.bar.get(i).setPlayerBar_x(PlayerBar.bar.get(i).playerBar_x + 1);
                };
                }
            }
        });
        primaryStage.setTitle("Cloud-Destroyer");
        primaryStage.setScene(gameScene);
        primaryStage.show();

        GameTick.animationTimer.start();



    }
}
