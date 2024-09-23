// Concrete visitor class for checking computer parts
class ComputerPartCheckVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Checking Keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Checking Monitor");
    }
}
