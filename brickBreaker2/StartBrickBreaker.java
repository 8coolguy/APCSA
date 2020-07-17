import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.input.KeyEvent; 
import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.scene.input.MouseEvent;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.scene.text.Text; 
import javafx.scene.text.Font;

public class StartBrickBreaker extends Application
{   
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    final int X =screenSize.width;
    final int Y =screenSize.height;
    final double padL=X*.18;
    final double padH=Y*.05;
    final double pX=X*.5;
    final double pY=Y*.9;
    final double R =Y*.02;
    final int bL =X/15;
    final int bH =Y/10;
    final int BRICKR =(7*Y/15)/bH;
    final int BRICKC =X/bL;
    int bricksLeft=BRICKR*BRICKC;
    int  finalScore =0;
    
    @Override
    public void start(Stage stage)
    {
        Pane root = new Pane();
        
        // 1.  Set the size of the Scene.  Use constants!
        Scene gameScene = new Scene(root,X ,Y);
        stage.setTitle("BrickBreaker");
        stage.setScene(gameScene);
        
        // 2. Creating paddle.  Se the size, initial placement,
        // and color of the paddle.
        
        Rectangle paddle = new Rectangle(pX,pY,padL,padH);
        paddle.setFill(Color.rgb(100,100,100));
        root.getChildren().addAll(paddle);
        
        /* 3.  Here is the event handler that responds to the left and
         * right buttons.  It moves the paddles.  Add the code that 
         * stops the paddle from moving off the side of the stage.
         */
        
        gameScene.setOnMouseMoved(new EventHandler<MouseEvent>(){
            @Override public void handle(MouseEvent j) {
                paddle.setX(j.getX());

                if (paddle.getX()<0)
                    paddle.setX(0);
                if (paddle.getX()>X-padL)
                    paddle.setX(X-padL);
                
            }
        });
        
                                Rectangle[][] bricks = new Rectangle[BRICKR][BRICKC];
                                for (int i=0; i < BRICKR; i++)   {
                                    for (int w=0; w < BRICKC; w++) {
                                        Rectangle brick = new Rectangle(w*bL+0,i*bH+.1*Y, bL,bH);
                                        bricks[i][w] = brick;
                                        brick.setFill(Color.rgb(150,150,150));
                                        brick.setStroke(Color.rgb(0,0,0));
                                        root.getChildren().addAll(brick);
                                    }
                                }
        
        
        
        
        Circle ball =new Circle(X/2,(Y)/2,R,Color.rgb(10,10,10));
        ball.relocate(X/2,(3*Y)/4);
        root.getChildren().addAll(ball);
        stage.show();
        final double SPEED=6;
        final Timeline x = new Timeline (new KeyFrame(Duration.millis(15),new EventHandler<ActionEvent>(){
               double dx=Math.random()+2;
               double dy=Math.pow(Math.pow(SPEED,2)-Math.pow(dx,2),.5);
               
            @Override
                public void handle(final ActionEvent t) {
                    Text GameComplete = new Text();
                    Text bricksLeftScreen = new Text();
                    
                    ball.setLayoutX(ball.getLayoutX()+dx);
                    ball.setLayoutY(ball.getLayoutY()+dy);
                    //System.out.println(" Ball Position: " +ball.getLayoutX()+ " , "+ ball.getLayoutY()+" Paddle Layout: " +paddle.getX()+ " , "+paddle.getY()+ " "+ball.getLayoutX()+" "+(paddle.getX()+padL));
                    
                    if(ball.getLayoutX()<(-X/2))//walls
                        dx=-dx;
                    if(ball.getLayoutX()+R>(X/2))
                        dx=-dx;
                    if(ball.getLayoutY()<(-Y/2))//up
                        dy=-dy;
                    if(ball.getLayoutY()+R>(Y/2)){//down
                            dx=dy=0;
                            Text gameOver = new Text();
                            gameOver.setX((0)); 
                            gameOver.setY((Y/2));
                            gameOver.setText("gameOver"); 
                            gameOver.setFont(Font.font ("Verdana", Y*.25));
                            root.getChildren().addAll(gameOver);
                            bricksLeftScreen.setX((X/4)); 
                            bricksLeftScreen.setY(Y*.1); 
                            bricksLeftScreen.setText("Bricks Left: " + bricksLeft +" Total Score: " +finalScore); 
                            bricksLeftScreen.setFont(Font.font ("Verdana", Y*.05));
                            root.getChildren().addAll(bricksLeftScreen);}
                    if( (ball.getLayoutX()+X/2>paddle.getX()) &&(ball.getLayoutY()+R+(Y/2)>(pY)) &&(ball.getLayoutX()+(R+X/2)<paddle.getX()+(padL)   )) //top    
                        dy=-dy;
                    


     
                                for (int i=0; i < BRICKR; i++)   {
                                    for (int w=0; w < BRICKC; w++) {
                                         Rectangle brick=bricks[i][w];
                                        if (brick!=null){
                                            int collisionStatus = checkForCollision(brick, ball, dx,dy);
                                            

                                            if (collisionStatus!=0)   {   

                                                if (brick.getFill().equals(Color.rgb(150,150,150))) 
                                                {
                                                    root.getChildren().removeAll(brick);
                                                    brick.setFill(Color.rgb(75,75,75));
                                                    brick.setStroke(Color.rgb(0,0,0));
                                                    root.getChildren().addAll(brick);
                                                    
                                                    if (collisionStatus == 1||collisionStatus==2){
                                                        dy = -dy;
                                                        finalScore = finalScore +100;}
                                                    else if (collisionStatus == 3||collisionStatus==4){
                                                        dx = -dx;
                                                        finalScore = finalScore +100;}
                                                }
                                                else if(brick.getFill().equals(Color.rgb(75,75,75))) {  //brick color is orange - make it disappear
                                                    bricks[i][w] = null;
                                                    finalScore = finalScore +300;
                                                    root.getChildren().removeAll(brick);
                                                    bricksLeft--;
                                                    if (bricksLeft == 0){   
                                                        dx = dy = 0;
                                                        bricksLeftScreen.setX((X/4)); 
                                                        bricksLeftScreen.setY(Y*.1); 
                                                        bricksLeftScreen.setText("Bricks Left: " + bricksLeft +" Total Score: " +finalScore); 
                                                        bricksLeftScreen.setFont(Font.font ("Verdana", Y*.05));
                                                        root.getChildren().addAll(bricksLeftScreen);
                                                        
                                                                        
                                                        GameComplete.setX((X)); 
                                                        GameComplete.setY(Y/2); 
                                                        GameComplete.setText("Game Complete"); 
                                                        bricksLeftScreen.setFont(Font.font ("Verdana", Y*.05));
                                                        root.getChildren().addAll(GameComplete);}
                                                }
                                                
                                                }
                         
                                            }
                                        }
                                    }
    
                                }

                
            }));
                               
                   


        x.setCycleCount(Timeline.INDEFINITE);
        x.play();
    }
//use these constants for determining location of ball collision with brick.
    static final int NONE = 0;
    static final int TOP = 1;
    static final int BOTTOM = 2;
    static final int RIGHT = 3;
    static final int LEFT = 4;
    public int checkForCollision(Rectangle brick, Circle ball,double dx, double dy) {
        int collisionStatus = NONE;
        // Collision on Vertical?
        if (((ball.getLayoutY() +(Y/2)> brick.getY()) &&(ball.getLayoutY()+ (Y/2)< brick.getY() + bH))&&(((ball.getLayoutX()+(X/2) + R) > brick.getX()) &&(((ball.getLayoutX()+(X/2) + R) < brick.getX() +bL)) || (((ball.getLayoutX() +(X/2)- R) > brick.getX()) &&((ball.getLayoutX() +(X/2)- R) < brick.getX() +bL)))){
           if (dy > 0){
               collisionStatus = LEFT;}
           else{
               collisionStatus = RIGHT;}}
        // Collision on Horizontal?
        if (((ball.getLayoutX()+(X/2) > brick.getX()) &&(ball.getLayoutX() +(X/2)< brick.getX() + bL)) &&(((ball.getLayoutY()+(Y/2) + R) > brick.getY()) &&(((ball.getLayoutY() + R)+(Y/2) < brick.getY() +bH)) || (((ball.getLayoutY() - R)+(Y/2) > brick.getY()) &&((ball.getLayoutY() - R)+(Y/2) < brick.getY() +bH)))){
            if (dx > 0){
                collisionStatus = TOP;}
            else{
                collisionStatus = BOTTOM;}}
        return collisionStatus;
}
   
}
