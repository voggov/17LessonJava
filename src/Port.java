public class Port {
    private static int valueOfCount = 0;
    private int radius;
    public Port(int r) {
        this.radius = r;
    }
    public void connect(){
        valueOfCount++;
    }
    public int getRadius(){
        return this.radius;
    }
    public void printInfo(){
        System.out.println(valueOfCount);
    }
}
