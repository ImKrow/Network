import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

import java.util.LinkedList;

public class MapController {
    //Network net = new Network(new LinkedList<Node>());

    MapGrid map = new MapGrid();
    @FXML
    private GridPane fxGrid;

    public void drawMap(){
//        for(int i = 0; i<= 20; i++){
//            for(int j = 0; j <= 20; j++){
//                fxGrid.add(new MapTile(i,j),i,j);
//            }
//        }
        fxGrid.add(new MapTile(1,1),1,1);
    }
}
