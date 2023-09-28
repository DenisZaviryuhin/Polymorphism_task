package app;

public class DeviceAService extends Device {
    double value1;
    double value2;

    public DeviceAService(String name, double value1, double value2) {
        super(name);
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    double calcResult() {
        return value1 * value2;
    }
}
