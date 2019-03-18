import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MapTile extends Rectangle {

    private double x;
    private double y;
    private double width = 10;
    private double height = 10;

    public MapTile(double x, double y){
        this.x = x;
        this.y = y;

    }
    public void draw(){
        this.setFill(Color.GREEN);
    }
}
