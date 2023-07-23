package HashMap;

import java.util.HashMap;

public class ItineraryTicket {
    public static void main(String[] args) {
        HashMap<String, String> ticket = new HashMap<>();
        ticket.put("Chennai", "Bengaluru");
        ticket.put("Mumbai", "Delhi");
        ticket.put("Goa", "Chennai");
        ticket.put("Delhi", "Goa");


        String start = getStart(ticket);

        while (ticket.containsKey(start)) {
            System.out.print(start + " -> ");
            start = ticket.get(start);
        }
        System.out.println(start);
    }


    public static String getStart(HashMap<String, String> ticket) {
        HashMap<String, String> revTick = new HashMap<>();

        for (String key : ticket.keySet()) {
            revTick.put(ticket.get(key), key );
        }

        for (String key: ticket.keySet()) {
            if (!revTick.containsKey(key)) {
                return key;
            }
        }
        return null;
    }


}
