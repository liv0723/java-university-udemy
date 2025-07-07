package udemy.university.section3;

import java.util.Random;

public class ChallengerHotelReservation {
    private final String CLIENT_NAME;
    private int daysStays;
    private double diaryCost;
    private boolean hasViewSeal;

    public ChallengerHotelReservation() {
        this.CLIENT_NAME = "pepe";
        this.daysStays = new Random().nextInt(1, 10);
        this.diaryCost = 1000.00;
        this.hasViewSeal = new Random().nextBoolean();
    }

    public String toString() {
        String clientInfo = """
                \t\t\t\t\t\t\t\tClient Information
                Client name: %s
                Days stays: %d
                """.formatted(this.CLIENT_NAME, this.daysStays);
        clientInfo = clientInfo +  "Diary Cost: " + this.diaryCost;

        return String.join("\n", clientInfo, ("Has View Seal: " + this.hasViewSeal));
    }
}
