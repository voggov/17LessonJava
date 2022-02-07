public class DecoratorTopping implements IBuy {
    private Product product;
    FormsTopping topping;

    public DecoratorTopping(Product product, FormsTopping topping) {
        this.product = product;
        this.topping = topping;
    }


    @Override
    public String sell() {
        return product.sell();
    }
}
