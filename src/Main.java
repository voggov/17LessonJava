import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Port port = new Port(500);
        ArrayList<Count> array = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            array.add(i,new Count(i % 2,i * 1000));
            array.get(i).inputCount(port);
        }
        port.printInfo();
    }
}
