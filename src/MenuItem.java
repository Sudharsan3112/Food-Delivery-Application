public class MenuItem {
    String dish;
    double amount;
    MenuItem(String dish,double amount)
    {
        this.dish=dish;
        this.amount=amount;
    }


    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {

        this.amount = amount;
    }
    @Override
    public String toString() {
        return dish + " - $" + amount;
    }
}
