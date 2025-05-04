import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Restaurent>restaurentsList=new ArrayList<>();
    public static List<Orders>orderList=new ArrayList<>();

    static void displayRestaurents()
    {
        int t=1;
        for (Restaurent restaurent:restaurentsList) {
            System.out.println(t+"."+restaurent.rest_name);
            t++;
        }
    }
    static void displayUserOrderHistory(User user)
    {
        for (Orders orders:user.orders)
        {
            orders.printDetailsofOrder();
        }
    }
    static void displayOrderHistory()
    {
        System.out.println("order history-eatYouLike!🧁🍫");
        for (Orders orders:orderList) {
            orders.printDetailsofOrder();
        }
    }
    static void display(Restaurent restaurent)
    {
        int t=1;
        System.out.println("Menu of 🍔🍕"+restaurent.getRest_name()+":");
        System.out.println("Rating of 🍔🍕"+restaurent.getRest_name()+":"+restaurent.getRating());
        for (MenuItem m:restaurent.getMenu())
        {
            System.out.println(t+"."+m.getDish()+":🪙"+m.getAmount());
            t++;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello 👋,Welcome to eatYouLike!🍔🍟");
        User user=new User("Sudharsan","Sudharsan.rick@gmail.com");
        Restaurent restaurent1=new Restaurent("Mom's Delight 🤱", Arrays.asList(
                new MenuItem("Pizza", 8.99),
                new MenuItem("Burger", 5.49),
                new MenuItem("Fries", 2.99))
        ,"⭐⭐⭐⭐⭐");
        restaurentsList.add(restaurent1);
        Restaurent restaurent2=new Restaurent("Tasty divine🥯🥞", Arrays.asList(
                new MenuItem("Pizza", 7.99),
                new MenuItem("Burger", 7.49),
                new MenuItem("Fries", 3.99))
       ,"⭐⭐⭐⭐" );
        restaurentsList.add(restaurent2);
        Restaurent restaurent3=new Restaurent("Delight endeavour🍔🍟", Arrays.asList(
                new MenuItem("Pizza", 7),
                new MenuItem("Burger", 7.4),
                new MenuItem("Fries", 3.92))
        ,"⭐⭐⭐⭐⭐");
        restaurentsList.add(restaurent3);
        Scanner z=new Scanner(System.in);
        User user1=new User("Sudharsan","sudharsan.rick@gmail.com");
        while (true)
        {
            System.out.println("1. For Placing Order 🧁🍫");
            System.out.println("2. For Viewing order History 🖥️");
            System.out.println("3.Exit 🙏");
            int option=z.nextInt();
            switch(option)
            {
                case 1:
                {
                    displayRestaurents();
                    System.out.println("Choose your favourite restaurant");
                    int opt=z.nextInt();
                    Restaurent restaurent=restaurentsList.get(opt-1);
                    System.out.println("Place your Order");
                    display(restaurent);
                    System.out.println("Choose your order:");
                    int item=z.nextInt();
                    System.out.println("Choose number of items required:");
                    int itemQauntity=z.nextInt();
                    Orders orders=new Orders(user1,restaurent,item,itemQauntity);
                    user1.orders.add(orders);
                    orderList.add(orders);
                    orders.printDetailsofOrder();
                    break;
                }
                case 2:
                {
                    displayOrderHistory();
                    break;
                }
                default:
                    break;
            }
        }

    }
}