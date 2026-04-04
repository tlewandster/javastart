package t19_Petle.e3;

import java.util.Scanner;

public class Thermostat {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę aktualną:");
        double currentTemperature = scanner.nextDouble();
        System.out.println("Podaj temperaturę docelową:");
        double targetTemperature = scanner.nextDouble();
        while (currentTemperature != targetTemperature) {
            System.out.println("Aktualna temperatura: " + currentTemperature + " stopni");
            if (currentTemperature < targetTemperature) {
                currentTemperature += 0.5;
            } else {
                currentTemperature -= 0.5;
            }
        }
        System.out.println("Osiągnięto temperaturę docelową " + currentTemperature + " stopni");
    }
}
