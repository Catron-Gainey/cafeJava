public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        // Menu variables (add yours below)
        double mochaPrice = 3.50;
        double dripCoffee = 2.00;
        double latte = 4.00;
        double cappuccino = 4.50;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Noah";
        String customer4 = "Jimmy";
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(pendingMessage + customer1);
        System.out.println(pendingMessage + customer3);
        if(isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino); 
        }
        else {
            System.out.println(customer3 + pendingMessage);
        }
        System.out.println(displayTotalMessage + (latte * 2));
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);
        }
        else{
            System.out.println(customer2 + pendingMessage);
        }
        System.out.println(displayTotalMessage + (latte - dripCoffee));
    }
}
