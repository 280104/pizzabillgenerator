//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        pizza basePizza = new pizza(false);
//        basePizza.addExtraToppings();
//        basePizza.addExtraCheese();
//        basePizza.takeAway();
//        basePizza.getBill();
      DeluxPizza dp = new DeluxPizza(true);
      dp.addExtraCheese();
      dp.addExtraToppings();
      dp.getBill();
    }
}