import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.LinkedList;

public class MapController {
    //Network net = new Network(new LinkedList<Node>());

    MapGrid map = new MapGrid();

    @FXML
    GridPane grido;
    @FXML
    VBox box;
    @FXML
    Button ok;

//    public MapController(){
//        drawMap();
//    }
    public void drawMap(){
        Rectangle rect = new Rectangle();
        rect.setHeight(30);
        rect.setWidth(30);
        rect.setFill(Color.BLUE);
        grido.add(rect,1,0);

        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                grido.add(map.getGrid()[i][j],i,j);

            }
        }
//        fxGrid.add(new MapTile(1,1),1,1);
        //fxGrid.add(new Button(),1,1);

    }
    @FXML
    private void pressOk(){
        Platform.exit();
    }
}
