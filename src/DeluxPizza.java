public class DeluxPizza extends pizza{
    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraToppings() {}

    @Override
    public void addExtraCheese() {}
}
