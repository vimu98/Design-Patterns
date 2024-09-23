public class Main {
    public static void main(String[] args) {
        // Create terminal expressions
        Expression jr = new TerminalExpression("Jr");
        Expression premadasa = new TerminalExpression("Premadasa");

        // Create composite expressions using OR, AND, and NOT operations
        Expression isJrOrPremadasa = new OrExpression(jr, premadasa);
        Expression isJrAndPremadasa = new AndExpression(jr, premadasa);
        Expression isNotJr = new NotExpression(jr);

        // Evaluate the composite expressions
        System.out.println("Does context contain Jr or Premadasa? " + isJrOrPremadasa.interpret("Jr Premadasa")); //true
        System.out.println("Does context contain both Jr and Premadasa? " + isJrAndPremadasa.interpret("Jr Premadasa")); //true
        System.out.println("Does context not contain Jr? " + isNotJr.interpret("Jr Premadasa")); //false
    }
}