public class Main {
    public static void main(String[] args) {
        // Create an originator and a caretaker
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Set the initial state and save it
        textEditor.type("Hello ");
        caretaker.saveMemento(textEditor.save());

        // Change the state and save it again
        textEditor.type("World");
        caretaker.saveMemento(textEditor.save());


        // Restore the state from the first memento
        textEditor.restore(caretaker.getMemento(0));
        System.out.println("Firts saved content: "+textEditor.getContent());

        // Restore the state from the second memento
        textEditor.restore(caretaker.getMemento(1));
        System.out.println("Firts saved content: "+textEditor.getContent());
    }
}