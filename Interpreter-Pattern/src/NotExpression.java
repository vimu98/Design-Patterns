// Non-terminal expression class for NOT operation
class NotExpression implements Expression {
    private Expression expr; //new TerminalExpression(jr)

    // Constructor to initialize the expression
    public NotExpression(Expression expr) {
        this.expr = expr;
    }

    @Override
    public boolean interpret(String context) {
        return !expr.interpret(context);
    }
}
