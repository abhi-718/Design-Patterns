public class Client {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();
        TextEditorInvoker invoker = new TextEditorInvoker();

        Command insertCommand = new InsertCommand(textEditor, "Hello", 0);
        invoker.execute(insertCommand);

        System.out.println("After Inserting Hello: "+textEditor.toString());

        Command insertCommand2 = new InsertCommand(textEditor, " World", 5);
        invoker.execute(insertCommand2);

        System.out.println("After Inserting World: "+textEditor.toString());

        invoker.undo();
        System.out.println("After Undoing: "+textEditor);

        invoker.redo();
        System.out.println("After Redoing "+textEditor);



    }
}
