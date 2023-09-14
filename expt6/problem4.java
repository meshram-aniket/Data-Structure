package expt6;

public class problem4 {
    public static void main(String[] args) {
        double carrierFrequency = 900 * Math.pow(10, 6); // Carrier frequency in Hz (900 MHz)
        double mobileSpeed = (96 * 1000) / 3600.0; // Mobile speed in meters per second (converted from km/h)

//        // Calculate the maximum Doppler frequency shift (Δf)
//        double maxDopplerFrequencyShift = (carrierFrequency / 3) * (mobileSpeed / 3 * Math.pow(10, 8));
//
//        // Calculate the channel bandwidth (B)
//        double channelBandwidth = 2 * maxDopplerFrequencyShift;
//
//        // Calculate the symbol rate (Rs)
//        double symbolRate = 2 * channelBandwidth;
//
//        System.out.println("Symbol Rate for Distortionless Transmission: " + symbolRate + " symbols per second (baud)");
        System.out.println(WaveLengthOfSignal(carrierFrequency));
        double ans = WaveLengthOfSignal(carrierFrequency);
        maxDopplexFreq(mobileSpeed, ans);
    }


    // To calculate wavelength of signal
    public static double WaveLengthOfSignal(double carrierFrequency) {
        double wavelength = 3*Math.pow(10,8) / carrierFrequency;
        System.out.print("Wavelength of signal = " + wavelength + "m");
        return wavelength;
    }


    // To determine max doppler frequency
    public static void maxDopplexFreq(double mobileSpeed, double wavelength) {
        System.out.println(mobileSpeed / wavelength);
    }
}
