import java.util.LinkedList;
import java.util.Scanner;

public class NetworkDriver {
    public static void main(String[] args) {
        Network net = new Network(new LinkedList<Node>());
        //want an array
        double[] local = new double[2];
        local[0] = 2;
        local[1] = 4;
        Node death = new Node(local,25,35);
        net.addNode(death);
        net.nodeInfo(death);

    }
}
