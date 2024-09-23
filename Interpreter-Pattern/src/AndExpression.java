// Non-terminal expression class for AND operation
class AndExpression implements Expression {
    private Expression expr1; //new TerminalExpression(jr)
    private Expression expr2; //new TerminalExpression(premadasa)

    // Constructor to initialize the expressions
    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
