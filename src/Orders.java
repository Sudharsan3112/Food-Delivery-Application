public class Orders {
    private User user;
    private Restaurent restaurent;
    String orderedItem;
    private double price;
    Orders(User user,Restaurent restaurent,int selectedItem,int count)
    {
        this.user=user;
        this.restaurent=restaurent;
        double p=0;
        if (restaurent != null && restaurent.getMenu() != null&&selectedItem-1<=restaurent.getMenu().size()) {
            this.orderedItem=restaurent.getMenu().get(selectedItem-1).getDish();
            this.price=restaurent.getMenu().get(selectedItem-1).getAmount();
        }
        price*=count;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRestaurent(Restaurent restaurent) {
        this.restaurent = restaurent;
    }

    public String getOrderedItem() {
        return orderedItem;
    }

    public void setOrderedItem(String orderedItem) {
        this.orderedItem = orderedItem;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public Restaurent getRestaurent() {
        return restaurent;
    }

    public double getPrice() {
        return price;
    }
    public  void  printDetailsofOrder()
    {
        System.out.println("Order Summary:");
        System.out.println("Customer: " + getUser().name);
        System.out.println("Address: " + getUser().email);
        System.out.println("Restaurant: " + getRestaurent().getRest_name());
        System.out.println("Enjoy your delight food 🥤🍟🍔" +getOrderedItem());
        System.out.println("Total Price: $" + getPrice());
    }
}
