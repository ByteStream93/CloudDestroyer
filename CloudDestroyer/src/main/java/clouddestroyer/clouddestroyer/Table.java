package clouddestroyer.clouddestroyer;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Table {

    public static int rows = 75;
    public static int columns = 50;

    public static int tableWidth = 1200;
    public static int tableHeight = 800;

    public static int fieldSizeWidth = tableWidth/rows;
    public static int fieldSizeHeight = tableHeight/columns;
    public static void drawTable(GraphicsContext graphicsContext){

        for(int row = 0; row < rows; row++){
            for (int column = 0; column < columns; column++){
                graphicsContext.setFill(Color.SKYBLUE);

                if(column > columns-5){
                    graphicsContext.setFill(Color.GREEN);
                }
                if(column > columns-3){
                    graphicsContext.setFill(Color.BROWN);
                }
            graphicsContext.fillRect(row * fieldSizeWidth, column * fieldSizeHeight, fieldSizeWidth, fieldSizeHeight);
            }
        }

    }


}
