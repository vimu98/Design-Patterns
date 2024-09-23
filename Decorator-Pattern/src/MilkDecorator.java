// Decorator class for adding milk
class MilkDecorator implements Coffee {
    private Coffee coffee; // basic coffee

    MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }
}
