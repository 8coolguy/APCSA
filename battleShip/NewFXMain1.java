import javafx.animation.FillTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class NewFXMain1 extends Application {
private static final double boxOuterSize = 50;
private static final double boxInnerSize = 48;
private static final double boxCornerRadius = 20;
private Rectangle rectangles = new Rectangle();

public static void main(String[] args) {
    launch(args);
}

@Override
public void start(Stage primaryStage) {
    primaryStage.setTitle("rect");


    Button btn = new Button();
    StackPane root = new StackPane();


    Rectangle r = new Rectangle();
    r.setFill(Color.BLUE);
    r.setX(2 * boxOuterSize);
    r.setY(0);
    r.setWidth(boxInnerSize);
    r.setHeight(boxInnerSize);
    r.setArcHeight(boxCornerRadius);
    r.setArcWidth(boxCornerRadius);
    r.setSmooth(true);
    r.localToScene(boxOuterSize, boxOuterSize);
    rectangles = r;

    root.getChildren().add(rectangles);

    btn.setText("display");
    btn.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
           FillTransition ft = new FillTransition(Duration.millis(3000), rectangles, Color.RED, Color.BLUE);
           ft.setCycleCount(1);
           ft.setAutoReverse(false);
           ft.play();
        }
    });

    root.getChildren().add(btn);
    primaryStage.setScene(new Scene(root, 300, 250));
    primaryStage.show();
  }
}