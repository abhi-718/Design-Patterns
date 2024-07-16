import java.util.Stack;

public class TextEditorInvoker {
    private Stack<Command> commandHistory = new Stack<>();
    private Stack<Command> redoCommand = new Stack<>();

    private Command command;

    public TextEditorInvoker(Command command) {
       this.command = command;
    }
    public TextEditorInvoker() {

    }

    public void execute(Command command) {
        command.execute();
        commandHistory.push(command);
        redoCommand.clear();
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command undoCommand = commandHistory.peek();
            undoCommand.undo();
            redoCommand.push(undoCommand);
            commandHistory.pop();
        }
    }

    public void redo() {
        if (!redoCommand.isEmpty()) {
            Command redo = redoCommand.peek();
            redo.execute();
            commandHistory.push(redo);
            redoCommand.pop();

        }
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
