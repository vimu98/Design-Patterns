public class Main {
    public static void main(String[] args) {
        // Create devices
        Device tv = new TV();
        Device radio = new Radio();

        // Create remote controls with different implementations
        RemoteControl basicTvRemote = new RemoteControl(new BasicRemoteImpl(tv));
        RemoteControl advancedTvRemote = new RemoteControl(new AdvancedRemoteImpl(tv));
        RemoteControl basicRadioRemote = new RemoteControl(new BasicRemoteImpl(radio));
        RemoteControl advancedRadioRemote = new RemoteControl(new AdvancedRemoteImpl(radio));

        // Use the remote controls
        basicTvRemote.pressOn();
        basicTvRemote.pressOff();

        advancedTvRemote.pressOn();
        advancedTvRemote.pressOff();
        advancedTvRemote.setVolume(10);

        basicRadioRemote.pressOn();
        basicRadioRemote.pressOff();

        advancedRadioRemote.pressOn();
        advancedRadioRemote.pressOff();
        advancedRadioRemote.setVolume(10);
    }
}