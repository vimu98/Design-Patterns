// Originator class
class TextEditor {
    private StringBuilder content = new StringBuilder();

    // Method to set the state
    public void type(String word) {
        content.append(word);
    }

    // Method to get the state
    public String getContent() {
        return content.toString();
    }

    // Method to save the state to a memento
    public Memento save() {
        return new Memento(content.toString());
    }

    // Method to restore the state from a memento
    public void restore(Memento memento) {
        content = new StringBuilder(memento.getState());
    }
}
