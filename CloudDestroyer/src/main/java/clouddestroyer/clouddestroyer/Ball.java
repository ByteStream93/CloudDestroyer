package clouddestroyer.clouddestroyer;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Ball {

    public int ball_x;
    public int ball_y;

    Ball(int x, int y){

        this.ball_x = x;
        this.ball_y = y;

    }

    static ArrayList<Ball> ball = new ArrayList<>(){{

        add(new Ball(37,44));

    }};

    public int getBall_x() {
        return ball_x;
    }

    public int getBall_y() {
        return ball_y;
    }

    public void setBall_x(int ball_x) {
        this.ball_x = ball_x;
    }

    public void setBall_y(int ball_y) {
        this.ball_y = ball_y;
    }

    public static void drawBall(GraphicsContext graphicsContext){
        LogicBall.move();
        graphicsContext.setFill(Color.DARKORANGE);

        graphicsContext.fillOval(ball.get(0).ball_x*Table.fieldSizeWidth,ball.get(0).ball_y*Table.fieldSizeHeight,
                Table.fieldSizeWidth,Table.fieldSizeHeight);
    }


}
