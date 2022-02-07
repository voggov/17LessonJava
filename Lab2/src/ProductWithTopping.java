public class ProductWithTopping extends DecoratorTopping {


    public ProductWithTopping(Product product, FormsTopping topping) {
        super(product, topping);
    }

    private String addTopping() {
        switch (super.topping) {
            case NONE:
                return " ";
            case SYROP:
                return "С сиропом!";
            case DRESSING:
                return "С посыпкой!";
        }
        return null;
    }

    @Override
    public String sell() {
        return super.sell() + addTopping();
    }
}
