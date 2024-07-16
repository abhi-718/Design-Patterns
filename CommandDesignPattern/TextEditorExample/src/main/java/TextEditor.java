public class TextEditor {
    private final StringBuilder message;
    public TextEditor() {
        message = new StringBuilder();
    }
    public void insertText(String text, int position) {
        message.insert(position,text);
    }
    public void deleteText(String text, int position) {
        message.delete(position,position + text.length());
    }

    public String toString() {
        return message.toString();
    }

}
