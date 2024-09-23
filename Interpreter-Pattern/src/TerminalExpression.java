// Terminal expression class
class TerminalExpression implements Expression {
    private String data;

    // Constructor to initialize the data
    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
