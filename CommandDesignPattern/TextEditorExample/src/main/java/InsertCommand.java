public class InsertCommand implements Command {
    private final TextEditor textEditor;
    private String message;
    private Integer position;
    public InsertCommand(TextEditor textEditor, String message, Integer position) {
        this.textEditor = textEditor;
        this.message = message;
        this.position = position;
    }
    @Override
    public void execute() {
        textEditor.insertText(message, position);
    }
    @Override
    public void undo() {
        textEditor.deleteText(message, position);
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void setPosition(Integer position) {
        this.position = position;
    }
}
