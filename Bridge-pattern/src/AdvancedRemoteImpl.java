// Concrete implementation of RemoteControlImpl for AdvancedRemote
class AdvancedRemoteImpl implements RemoteControlImpl {
    private Device device;

    AdvancedRemoteImpl(Device device) {
        this.device = device;
    }

    @Override
    public void pressOn() {
        device.turnOn();
    }

    @Override
    public void pressOff() {
        device.turnOff();
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
    }
}
