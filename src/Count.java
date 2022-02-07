public class Count {
    private boolean circle = true;
    private int radius = 0;

    public Count(boolean f, int r) {
        this.circle = f;
        this.radius = r;
    }

    public Count(int i, int r) {
        if (i % 2 == 0){
            this.circle = false;
        } else {
            this.circle = true;
        }
        this.radius = r;
    }

    public void inputCount(Port port) {
        if (this.circle){
            port.connect();
        } else if (!this.circle){
            Adapter adapter = new Adapter();
            adapter.connectSquareCount(port,this);
        }
    }
    public int getRadius(){
        return this.radius;
    }
}
