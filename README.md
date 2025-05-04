# **EatYouLike! 🍔🍟 - Restaurant Ordering System**

## **Description**
EatYouLike! is an interactive restaurant ordering system that allows users to choose restaurants, view menus, place orders, and view their order history. The system includes multiple restaurants with varying ratings, menus, and prices. Users can place an order by selecting their favorite restaurant, choosing from the menu, and specifying the quantity of the dish. The app then calculates the total price and saves the order for future reference.

---

## **Features**
1. **Restaurant Listing**: Displays a list of available restaurants with ratings.
2. **Restaurant Menu**: Each restaurant has a menu with a list of dishes and prices.
3. **Order Placement**: Users can place an order by selecting a dish and specifying the quantity.
4. **Order History**: Users can view their order history, including order details like restaurant, ordered items, and total price.
5. **Multi-restaurant Support**: Users can select from a variety of restaurants.

---

## **Technology Stack**
- **Java**: The core programming language used to implement the backend logic.
- **ArrayList**: Used to manage dynamic lists for restaurants, orders, and users.
- **Scanner**: For taking user inputs in the console interface.

---

## **Classes Overview**

### 1. **Main**
   - Controls the program flow.
   - Handles user input to place orders and view order history.
   - Displays the list of restaurants and their menus.

### 2. **User**
   - Represents a user in the system.
   - Stores user information like name, email, and orders placed by the user.

### 3. **Restaurent**
   - Represents a restaurant.
   - Stores the restaurant name, menu (list of `MenuItem`), and rating.

### 4. **Orders**
   - Represents an order placed by a user.
   - Stores the ordered item(s), restaurant, user details, and total price.
   - Prints the order details.

### 5. **MenuItem**
   - Represents a menu item at a restaurant.
   - Stores the dish name and its price.

---

## **How to Use**

1. **Run the Program**: 
   - Once you run the `Main.java` file, you will be greeted with a welcome message.
   
2. **Place an Order**:
   - Choose an option to place an order.
   - Select a restaurant from the list of available options.
   - Browse the restaurant menu and select a dish.
   - Specify the quantity of the dish you want to order.
   - The total price will be calculated, and the order will be added to the history.

3. **View Order History**:
   - Select the option to view your previous orders.
   - All past orders will be displayed with details such as restaurant name, ordered items, and price.

4. **Exit the Program**:
   - Choose the exit option when you no longer want to interact with the system.

---

## **💻Sample Output**
Hello 👋, Welcome to EatYouLike! 🍔🍟
1. For Placing Order 🧁🍫
2. For Viewing Order History 🖥️
3. Exit 🙏
Enter your choice: 1
Choose your favorite restaurant:
1. Mom's Delight 🤱
2. Tasty divine🥯🥞
3. Delight endeavour🍔🍟
Enter your choice: 1
Place your Order:
Menu of 🍔🍕Mom's Delight 🤱:
1. Pizza: 🪙8.99
2. Burger: 🪙5.49
3. Fries: 🪙2.99
Choose your order: 1
Choose number of items required: 2
Order Summary:
Customer: Sudharsan
Address: sudharsan.rick@gmail.com
Restaurant: Mom's Delight 🤱
Enjoy your delight food 🥤🍟🍔Pizza
Total Price: $17.98

