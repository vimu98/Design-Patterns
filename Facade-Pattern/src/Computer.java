// Facade class
class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    // Constructor to initialize the subsystems
    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    // Simplified interface to start the computer
    public void start() {
        cpu.start();
        memory.load();
        hardDrive.read();
    }

    // Simplified interface to shut down the computer
    public void shutDown() {
        cpu.stop();
        memory.unload();
        hardDrive.write();
    }
}
