package app;

public class DeviceBService extends Device {
    double value1;
    double value2;
    static final double CONST = 7.77;

    public DeviceBService(String name, double value1, double value2) {
        super(name);
        this.value1 = value1;
        this.value2 = value2;

    }

    @Override
    double calcResult() {
        return (value1 + value2) * CONST;
    }
}
