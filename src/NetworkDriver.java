import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.LinkedList;


public class NetworkDriver extends Application {
    public void start(Stage stage) throws Exception {

        final int x = 600;
        final int y = 600;

        Parent root = FXMLLoader.load(getClass().getResource("MapControllerFXML.fxml"));

        stage.setTitle("CarNetwork");
        stage.setScene(new Scene(root,x,y));
        stage.show();



        Network net = new Network(new LinkedList<Node>());
        MapController mapControl = new MapController();
        mapControl.drawMap();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
