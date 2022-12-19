package clouddestroyer.clouddestroyer;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Table {

    public static int rows = 600;
    public static int columns = 400;

    public static int fieldSizeWidth = 1200/600;
    public static int fieldSizeHeight = 800/400;
    public static void drawTable(GraphicsContext graphicsContext){

        for(int row = 0; row < rows; row++){
            for (int column = 0; column < columns; column++){
                graphicsContext.setFill(Color.SKYBLUE);

                if(column > columns-15){
                    graphicsContext.setFill(Color.GREEN);
                }
                if(column > columns-10){
                    graphicsContext.setFill(Color.BROWN);
                }
            graphicsContext.fillRect(row * fieldSizeWidth, column * fieldSizeHeight, fieldSizeWidth, fieldSizeHeight);
            }
        }

    }


}
