// Concrete implementation of RemoteControlImpl for BasicRemote
class BasicRemoteImpl implements RemoteControlImpl {
    private Device device;

    BasicRemoteImpl(Device device) {
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
}
