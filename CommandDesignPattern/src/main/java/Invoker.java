public class Invoker {

    Command command;

    public Invoker() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pushButton() {
        command.execute();
    }
}