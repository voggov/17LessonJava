public class PrepareDough {
    private boolean status;

    public void prepare(){
        System.out.println("Подготовка теста:");
        this.status = true;
    }

    public boolean isStatus() {
        return status;
    }
}
