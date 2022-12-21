package clouddestroyer.clouddestroyer;

public class LogicBall {

    public static int move_x = 1;
    public static int move_y = 1;

    public static void setMove_x(int move_x) {
        LogicBall.move_x = move_x;
    }

    public static void setMove_y(int move_y) {
        LogicBall.move_y = move_y;
    }


    public static void checkBall(){

       for ( int digit = 0; digit < Clouds.cloudsContainer.size(); digit++){

           if(PlayerBar.bar.get(digit).getPlayerBar_x() == Ball.ball.get(0).ball_x && PlayerBar.bar.get(digit).getPlayerBar_y()-1 == Ball.ball.get(0).ball_y){

            setMove_y(move_y*(-1));
            setMove_x(move_x*(-1));

           }
           //Upper and DownBorder of CloudsCheck
           if(Clouds.cloudsContainer.get(digit).getCloud_y()-1 == Ball.ball.get(0).ball_y && Clouds.cloudsContainer.get(digit).cloud_x == Ball.ball.get(0).ball_x ||
                   Clouds.cloudsContainer.get(digit).getCloud_y()+1 == Ball.ball.get(0).ball_y){

               setMove_y(move_y*(-1));
               Clouds.cloudsContainer.remove(Clouds.cloudsContainer.get(digit).cloud_x);
               Clouds.cloudsContainer.remove(Clouds.cloudsContainer.get(digit).cloud_y);

           }
           //CloudsCheck sides
           if(Clouds.cloudsContainer.get(digit).getCloud_x()-1 == Ball.ball.get(0).ball_x && Clouds.cloudsContainer.get(digit).cloud_y == Ball.ball.get(0).ball_y ||
                   Clouds.cloudsContainer.get(digit).getCloud_x()+1 == Ball.ball.get(0).ball_x){

               setMove_y(move_x*(-1));
               Clouds.cloudsContainer.remove(Clouds.cloudsContainer.get(digit).cloud_x);
               Clouds.cloudsContainer.remove(Clouds.cloudsContainer.get(digit).cloud_y);

           }

           if(Ball.ball.get(0).ball_x == 0 || Ball.ball.get(0).ball_x == Table.columns){

               setMove_x(move_x*(-1));

           }
           if(Ball.ball.get(0).ball_y == 0 ){

               setMove_x(move_y*(-1));

           }

           if(Ball.ball.get(0).ball_y == 45){

               System.exit(0);

           }

       }

    }

    public static void move(){

        checkBall();
        Ball.ball.get(0).setBall_x(Ball.ball.get(0).getBall_x()+move_x);
        Ball.ball.get(0).setBall_y(Ball.ball.get(0).getBall_y()+move_y);

    }

}
