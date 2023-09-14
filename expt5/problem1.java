package expt5;

public class problem1 {
    public static void main(String[] args) {
        // Given parameters
        double pathLossExponent = 4.0;
        double referenceDistance = 1.0; // Assume a reference distance of 1 unit
        double transmittedPower = 1.0; // Assume a transmitted power of 1 unit
        double distance = 7.0; // Boundary of the operating cell
        double interferenceDistance = 14.0; // Distance to interfering cells

        // Calculate the power of the desired signal (P_s)
        double ps = transmittedPower * Math.pow(distance / referenceDistance, -pathLossExponent);

        // Calculate the power of interference (P_i)
        double pi = transmittedPower * Math.pow(interferenceDistance / referenceDistance, -pathLossExponent);

        // Compute the worst-case S/I ratio
        double siRatio = ps / (2 * pi);

        // Check if the practical S/I value is 6 dB higher than the theoretical value of 18 dB
        double theoreticalSiRatio = 10 * Math.log10(18); // Convert 18 dB to linear scale
        double practicalSiRatio = 10 * Math.log10(siRatio); // Convert siRatio to dB

        System.out.println("Theoretical S/I Ratio (dB): " + theoreticalSiRatio);
        System.out.println("Practical S/I Ratio (dB): " + practicalSiRatio);

        if (practicalSiRatio > theoreticalSiRatio + 6) {
            System.out.println("The practical S/I value is 6 dB higher than the theoretical value.");
        } else {
            System.out.println("The practical S/I value is not 6 dB higher than the theoretical value.");
        }
    }
}
