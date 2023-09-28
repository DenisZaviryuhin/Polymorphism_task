package app;

abstract class Device {
    String deviceName;

    public Device(String name) {
        this.deviceName = name;
    }

    abstract double calcResult();



}





