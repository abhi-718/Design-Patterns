


public class SimpleRemoteControl {

    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        Invoker invoker = new Invoker();
        invoker.setCommand(lightOnCommand);
        invoker.pushButton();
        invoker.setCommand(lightOffCommand);
        invoker.pushButton();
    }
}
