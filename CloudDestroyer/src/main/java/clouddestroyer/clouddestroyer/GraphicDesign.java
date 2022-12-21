package clouddestroyer.clouddestroyer;

public class GraphicDesign {

    public static void gameTick(){


        Table.drawTable(Main.graphicsContext);
        PlayerBar.drawBar(Main.graphicsContext);
        Ball.drawBall(Main.graphicsContext);

        if(Clouds.stop == 0){
           Clouds.initializeClouds();

        }

        Clouds.drawClouds(Main.graphicsContext);

    }

}
