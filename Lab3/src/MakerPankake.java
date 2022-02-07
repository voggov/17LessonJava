public class MakerPankake {

    public void preparePankake(PrepareDough dough) {
        if (dough.isStatus()) {
            System.out.println("Готовка блинов");
        }
        else {
            System.out.println("Какие-то проблемы....");
        }
    }
}
