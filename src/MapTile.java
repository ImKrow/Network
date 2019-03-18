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
        System.out.println("mk");
        this.setWidth(width);
        this.setHeight(height);
        if(x %2 != 0 && y % 2 ==0) {
            this.setFill(Color.GREEN);
        } else{
            this.setFill(Color.BLUE);
        }
    }
    //todo checking git commits
}
