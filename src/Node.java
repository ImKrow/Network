public class Node {
    private double y;
    private double x;
    private double maxSpeed;
    private double minSpeed;
    private double currentSpeed;
    private double[] location;
    private static PathFinder pather = new PathFinder();


    public Node(double[] location, double minSpeed, double maxSpeed){
        this.location = location;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.x = location[0];
        this.y = location[1];


    }
    private void move(){
        //todo will move the car based on direction
        location[0] = x;
        location[1] = y;
    }
    private void logic(){

    }
    public double[] getLocation(){
        return location;
    }
    public double getMinSpeed() {
        return minSpeed;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }


}
