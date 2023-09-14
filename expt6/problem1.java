package expt6;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter carrier frequency = ");
        double CarrierFrequency = sc.nextDouble() * Math.pow(10, 6);
        double wavelength = (3 * Math.pow(10, 8)) / (CarrierFrequency);
        System.out.println("Wavelength = " + wavelength + "m");
        System.out.print("enter speed of vehicle = ");
        double speed = sc.nextInt();
        speed = speed / 2.237;
        System.out.println("Vehicle speed = " + speed + "m/s");
        movingTowardsTransmitter(CarrierFrequency, speed);
        movingAwayFromTransmitter(CarrierFrequency, speed);
    }


    // vehicle is moving directly towards the transmitter
    public static void movingTowardsTransmitter(double CarrierFrequency, double speedVehicle) {
        double ans = CarrierFrequency +  (speedVehicle / 0.162);
        System.out.println("The doppler Frequency is = " + ans);
    }


    // vehicle is moving directly towards the transmitter
    public static void movingAwayFromTransmitter(double CarrierFrequency, double speedVehicle) {
        double ans = CarrierFrequency - (speedVehicle / 0.162);
        System.out.println("The doppler Frequency is = " + ans);
    }
}
