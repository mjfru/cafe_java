public class CafeJava {
    public static void main(String[] args) {
        // App Variables Below:

        // Display Lines Below:
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly.";
        String readyMessage = ", your order is ready.";
        String displayTotalMessage = "Your total is $";

        // Menu variables below:
        //? Following the same camelcase naming convention, create drink price variables for drip coffee, latte, and cappuccino.
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 4.0;
        double cappuccinoPrice = 3.5;

        // Customer name variables:
        //? Create customer variables for Sam, Jimmy, and Noah.
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions
        //? Create the order status flag (true/false) for each customer.
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;

        // App Interaction Simulation
        
        // Customer interaction print statements will go here:
        //? Cindhuri ordered a coffee. Based on her order status, print the correct status message to the console.
        System.out.println(customer1 + pendingMessage);

        //? Noah ordered a cappucino. Use an if statement to check the status of his order and print the correct status message. If it is ready, also print the message to display the total.
        if(isReadyOrder4) {
            System.out.println(displayTotalMessage + cappuccinoPrice);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }

        //? Sam just ordered 2 lattes, print the message to display their total. Next, use an if statement to print the appropriate order status message. Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).
        System.out.println(displayTotalMessage + lattePrice*2);
        if(isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }

        //? Jimmy just realized he was charged for a coffee but had ordered a latte. Print the total message with the new calculated total (what he owes) to make up the difference.
        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));
    }
}
