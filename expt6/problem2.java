package expt6;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        double carrierFrequency = 900 * Math.pow(10, 6); // 900 MHz in Hz
        double speedOfLight = 3 * Math.pow(10, 8); // Speed of light in meters per second
        double mobileSpeed = 72 * 1000 / 3600.0; // Mobile speed in meters per second (converted from km/h)

        // Scenario 1: Moving directly away from the base station transmitter
        double relativeVelocityAway = mobileSpeed;
        double receivedFrequencyAway = calculateReceivedFrequency(carrierFrequency, speedOfLight, relativeVelocityAway);
        System.out.println("Received Frequency (Moving Away): " + receivedFrequencyAway / Math.pow(10, 6) + " MHz");

        // Scenario 2: Moving directly towards the base station transmitter
        double relativeVelocityTowards = -mobileSpeed;
        double receivedFrequencyTowards = calculateReceivedFrequency(carrierFrequency, speedOfLight, relativeVelocityTowards);
        System.out.println("Received Frequency (Moving Towards): " + receivedFrequencyTowards / Math.pow(10, 6) + " MHz");

        // Scenario 3: Moving at a 60-degree angle to the direction of arrival
        double angleDegrees = 60;
        double relativeVelocityAtAngle = mobileSpeed * Math.cos(Math.toRadians(angleDegrees));
        double receivedFrequencyAtAngle = calculateReceivedFrequency(carrierFrequency, speedOfLight, relativeVelocityAtAngle);
        System.out.println("Received Frequency (At 60 degrees): " + receivedFrequencyAtAngle / Math.pow(10, 6) + " MHz");

        // Scenario 4: Moving in a direction perpendicular to the direction of arrival
        double relativeVelocityPerpendicular = 0; // Perpendicular motion, no change in frequency
        double receivedFrequencyPerpendicular = calculateReceivedFrequency(carrierFrequency, speedOfLight, relativeVelocityPerpendicular);
        System.out.println("Received Frequency (Perpendicular): " + receivedFrequencyPerpendicular / Math.pow(10, 6) + " MHz");
    }

    private static double calculateReceivedFrequency(double f, double c, double relativeVelocity) {
        return f * (c + relativeVelocity) / c;
    }
}
