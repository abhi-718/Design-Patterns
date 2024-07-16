public class DeleteCommand implements Command{

    private final TextEditor textEditor;
    private String message;
    private Integer position;

    public DeleteCommand(TextEditor textEditor, String message, Integer position) {
        this.textEditor = textEditor;
        this.message = message;
        this.position = position;
    }
    @Override
    public void execute() {
        textEditor.deleteText(message, position);
    }
    @Override
    public void undo() {
        textEditor.insertText(message, position);
    }
    public void setPosition(Integer position) {
        this.position = position;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
