package clouddestroyer.clouddestroyer;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class PlayerBar {

    public int playerBar_x;
    public int playerBar_y;

    PlayerBar(int x, int y){

        this.playerBar_x = x;
        this.playerBar_y = y;

    }



    public static ArrayList<PlayerBar> bar = new ArrayList<>(){{

        add(new PlayerBar(34,45));
        add(new PlayerBar(35,45));
        add(new PlayerBar(36,45));
        add(new PlayerBar(37,45));
        add(new PlayerBar(38,45));
        add(new PlayerBar(39,45));
        add(new PlayerBar(40,45));
    }};

    public int getPlayerBar_x() {
        return playerBar_x;
    }

    public int getPlayerBar_y() {
        return playerBar_y;
    }

    public void setPlayerBar_x(int playerBar_x) {
        this.playerBar_x = playerBar_x;
    }

    public void setPlayerBar_y(int playerBar_y) {
        this.playerBar_y = playerBar_y;
    }

    public static void drawBar(GraphicsContext graphicsContext){

        graphicsContext.setFill(Color.DARKGREY);

        for(int index = 0; index < bar.size(); index++){
            
            graphicsContext.fillRect(bar.get(index).playerBar_x*Table.fieldSizeWidth,bar.get(index).playerBar_y*Table.fieldSizeHeight,
            Table.fieldSizeWidth,Table.fieldSizeHeight);
        }

    }

}
