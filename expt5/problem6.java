package expt5;

public class problem6 {
    public static void main(String[] args) {
        // Given data
        int totalTrafficChannels = 312;
        int nPattern = 7;
        int sectorsInSystem1 = 3;

        // Calculate traffic channels per sector for System 1
        int trafficChannelsPerSectorSystem1 = totalTrafficChannels / (nPattern * sectorsInSystem1);

        // For System 2, you need to provide the number of sectors and other details
        int totalSectorsSystem2 = 6; // Replace with the actual number of sectors in System 2

        // Calculate traffic channels per sector for System 2
        int trafficChannelsPerSectorSystem2 = totalTrafficChannels / totalSectorsSystem2;

        // Display the results
        System.out.println("System 1 - Traffic Channels per Sector: " + trafficChannelsPerSectorSystem1);
        System.out.println("System 2 - Traffic Channels per Sector: " + trafficChannelsPerSectorSystem2);
    }
}
