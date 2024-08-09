public class pizza {
    private int price;
    private Boolean veg;
    private int extrachessePrice = 100;
    private int extraToppingsPrice = 150;
    private int backpackprice = 20;
    private int basePizzaPrice ;
    private Boolean isExtraCheeseAdded = false;
    private Boolean isExtraToppingsAdded = false;
    private Boolean isOptedForTakeAway = false;


    public pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
             this.price = 300;
        }else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded = true;

        this.price += extrachessePrice;
    }
    public void addExtraToppings(){
        isExtraToppingsAdded = true;

        this.price += extraToppingsPrice;

    }
    public void takeAway(){
        isOptedForTakeAway = true;

        this.price += backpackprice;

    }
    public void getBill(){
        String bill ="";
        System.out.println("pizza :"+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra cheese added: " +extraToppingsPrice+"\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra toppings added: " +extraToppingsPrice+"\n";
        }
        if(isOptedForTakeAway){
            bill += "Opted for take away: "+backpackprice+"\n";
        }
        bill +="Bill: "+this.price+"\n";
        System.out.println(bill);
    }
}
