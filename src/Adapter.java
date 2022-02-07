public class Adapter {
    public void connectSquareCount(Port port, Count count){
        if (port.getRadius() > count.getRadius()){
            port.connect();
        }
    }
}
