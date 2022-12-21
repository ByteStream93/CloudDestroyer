package clouddestroyer.clouddestroyer;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class HighScore {

    public int coordinate_x;
    public int coordinate_y;

    public static int score = 0;

    HighScore(int coordinate_x, int coordinate_y) {
        this.coordinate_x = coordinate_x;
        this.coordinate_y = coordinate_y;
    }

    public static void drawingHighscore(GraphicsContext graphicsContext) {
        graphicsContext.setStroke(Color.WHITE);
        graphicsContext.setFont(Font.font(20));
        graphicsContext.strokeText("Score: " + score, 68* Table.fieldSizeWidth, 49* Table.fieldSizeHeight);
    }
}
