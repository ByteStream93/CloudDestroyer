package clouddestroyer.clouddestroyer;

public class GraphicDesign {

    public static void gameTick(){
        System.out.println("X: " + Ball.ball.get(0).getBall_x() + " Y: " + Ball.ball.get(0).ball_y);
        Table.drawTable(Main.graphicsContext);
        PlayerBar.drawBar(Main.graphicsContext);
        Ball.drawBall(Main.graphicsContext);

        if(Clouds.stop == 0){
           Clouds.initializeClouds();
        }

        Clouds.drawClouds(Main.graphicsContext);

    }

}
