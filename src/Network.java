import java.util.LinkedList;
import java.util.List;

public class Network {

    private LinkedList<Node> nodes;


    //might change later
    public Network(LinkedList<Node> nodes){
        this.nodes = nodes;
    }
    public void addNode(Node node){
        nodes.add(node);

    }
    public void nodeInfo(Node node){
        double[] local = node.getLocation();
        System.out.println("x: " + local[0] + " y: " + local[1]);
        System.out.println(node.getMinSpeed());
        System.out.println(node.getMaxSpeed());

    }
}

