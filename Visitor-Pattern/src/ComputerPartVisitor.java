// Visitor interface
interface ComputerPartVisitor {
    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
