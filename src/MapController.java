import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.LinkedList;

public class MapController {
    //Network net = new Network(new LinkedList<Node>());

    MapGrid map = new MapGrid();

    @FXML
    GridPane grido;
    @FXML
    VBox box;

    public void drawMap(){
//        for(int i = 0; i<= 20; i++){
//            for(int j = 0; j <= 20; j++){
//                fxGrid.add(new MapTile(i,j),i,j);
//            }
//        }
//        fxGrid.add(new MapTile(1,1),1,1);
        //fxGrid.add(new Button(),1,1);
        try {
            box.resize(700,700);
            //grido.setVgap(10);
        } catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}
