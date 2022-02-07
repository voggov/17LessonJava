public class Product implements IBuy {
    FormsProduct type;
    public Product(FormsProduct type) {
        this.type = type;
    }

    @Override
    public String sell() {
        switch (type) {
            case YOGURT:
                return "Вы купили: Йогурт!!!!";
            case SMOOTHIE:
                return "Вы купили: Смузи!!!!!";
            case ICE_CREAM:
                return "Вы купили: Мороженое!!!!!";
        }
        return null;
    }
}
