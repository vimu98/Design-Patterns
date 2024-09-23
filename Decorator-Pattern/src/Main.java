public class Main {
    public static void main(String[] args) {

        // Create a basic coffee
        Coffee basicCoffee = new BasicCoffee();
        System.out.println(basicCoffee.getDescription() + " costs $" + basicCoffee.cost()); //Basic Coffee costs $2.0

        // Create a coffee with milk using the decorator
        Coffee milkCoffee = new MilkDecorator(basicCoffee);
        System.out.println(milkCoffee.getDescription() + " costs $" + milkCoffee.cost());  //Basic Coffee, Milk costs $2.5


    }
}

// Basic Coffee costs $2.0
// Basic Coffee, Milk costs $2.5
