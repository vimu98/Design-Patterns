// Non-terminal expression class for OR operation
class OrExpression implements Expression {
    private Expression expr1; //new TerminalExpression(jr)
    private Expression expr2; //new TerminalExpression(premadasa)

    // Constructor to initialize the expressions
    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
