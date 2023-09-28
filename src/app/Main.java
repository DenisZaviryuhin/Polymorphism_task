package app;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    static double value1;
    static double value2;
    static double result;
    static String name;
    static String roundRes;
    static String resultDeviceA;
    static String resultDeviceB;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Enter first value : ");
        value1 = scanner.nextDouble();
        System.out.print("Enter second value : ");
        value2 = scanner.nextDouble();
        scanner.close();
        handleDeviceA();
        handleDeviceB();


    }

    private static void handleDeviceA() {
        name = "DeviceA";

        DeviceAService deviceAService = new DeviceAService(name, value1, value2);
        result = deviceAService.calcResult();
        roundRes = Rounder.roundValue(result);
        resultDeviceA = "The result of " + name + " is " + roundRes;

        getOuput(resultDeviceA);


    }

    private static void handleDeviceB() {
        name = "DeviceB";

        DeviceBService deviceBService = new DeviceBService(name, value1, value2);
        result = deviceBService.calcResult();
        roundRes = Rounder.roundValue(result);
        resultDeviceB = "The result of " + name + " is " + roundRes;

        getOuput(resultDeviceB);


    }

    private static void getOuput(String output) {
        System.out.println(output);

    }
}
