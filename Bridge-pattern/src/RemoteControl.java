// Abstraction class (RemoteControl) that uses the implementation
class RemoteControl {
    private RemoteControlImpl impl;

    RemoteControl(RemoteControlImpl impl) {
        this.impl = impl;
    }

    public void pressOn() {
        impl.pressOn();
    }

    public void pressOff() {
        impl.pressOff();
    }

    // Additional method for AdvancedRemote
    public void setVolume(int volume) {
        if (impl instanceof AdvancedRemoteImpl) {
            ((AdvancedRemoteImpl) impl).setVolume(volume);
        }
    }
}
