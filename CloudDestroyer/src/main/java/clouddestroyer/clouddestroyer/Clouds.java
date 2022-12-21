package clouddestroyer.clouddestroyer;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Clouds {

public int cloud_x;
public int cloud_y;

public static int stop = 0;
public static ArrayList<Clouds> cloudsContainer = new ArrayList<>();

static public int amountOfClouds = 150;


Clouds(int cloud_x, int cloud_y){
    this.cloud_x = cloud_x;
    this.cloud_y = cloud_y;
}

 public static void initializeClouds(){

    for(int cloud = 0; cloud < amountOfClouds; cloud++ ){

      int cloud_coordinate_x = (int) (Math.random()*Table.rows);
      int cloud_coordinate_y = (int) (Math.random()*Table.columns/2);

      cloudsContainer.add(new Clouds(cloud_coordinate_x,cloud_coordinate_y));

      stop = 1;

    }
 }

 public static void drawClouds(GraphicsContext graphicsContext){
    graphicsContext.setFill(Color.BLUE);



    for(int index = 0; index < cloudsContainer.size(); index++){

        graphicsContext.fillRect(cloudsContainer.get(index).getCloud_x()*Table.fieldSizeWidth,
                cloudsContainer.get(index).getCloud_y()*Table.fieldSizeHeight,Table.fieldSizeWidth,Table.fieldSizeHeight);

     }
 }

    public int getCloud_x() {
        return cloud_x;
    }

    public int getCloud_y() {
        return cloud_y;
    }
}
