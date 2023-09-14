package expt6;

public class problem3 {
    public static void main(String[] args) {
        double maxDopplerFrequencyShift = 70; // Maximum Doppler frequency shift in Hz
        double transmissionFrequency = 900 * Math.pow(10, 6); // Transmission frequency in Hz (900 MHz)
        double speedOfLight = 3 * Math.pow(10, 8); // Speed of light in meters per second

        // Calculate the maximum speed (Vr)
        double maxSpeed = (maxDopplerFrequencyShift * speedOfLight) / transmissionFrequency;
        System.out.println("Maximum Speed of Vehicle: " + maxSpeed + " meters per second");
    }
}
