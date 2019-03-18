import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MapTile extends Rectangle {

    private double x;
    private double y;
    private double width = 30;
    private double height = 30;

    public MapTile(double x, double y){
        this.x = x;
        this.y = y;
        draw();
    }
    public void draw(){
        this.setLayoutX(x*width);
        this.setLayoutY(y*height);
        this.setFill(Color.GREEN);
    }
}
