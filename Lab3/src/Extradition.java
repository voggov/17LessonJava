public class Extradition {
    private PrepareTableware tableware = new PrepareTableware();
    private PrepareDough dough = new PrepareDough();
    private MakerPankake pankake = new MakerPankake();

    public void cooking(int count){
        tableware.prepare(count);
        dough.prepare();
        pankake.preparePankake(dough);

        for (int i = 0; i < count; i++){
            System.out.print("o ");
        }
        System.out.println("\nПриятного аппетита!");

    }

}
