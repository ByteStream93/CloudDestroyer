package clouddestroyer.clouddestroyer;

import javafx.animation.AnimationTimer;

public class GameTick {

    public static AnimationTimer animationTimer = new AnimationTimer() {

        long lastUpdate = 0;

        @Override
        public void handle(long now) {
            
            if (now - lastUpdate >= 66666666) {
                
                GraphicDesign.gameTick();
                lastUpdate = now;

            }
        }
    };
}


