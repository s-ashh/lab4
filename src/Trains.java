import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.concurrent.ThreadLocalRandom;

public class Trains {
    private int trainNumber;
    private Directions direction;
    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;
    private int distance;

    public void setTrainNumber() {
        this.trainNumber = ThreadLocalRandom.current().nextInt(124, 136);
    }

    public void setDirection() {
        switch (ThreadLocalRandom.current().nextInt(1, 3)) {
            case 1:
                this.direction = Directions.Belgorod;
                break;
            case 2:
                this.direction = Directions.Nicolaev;
                break;
            case 3:
                this.direction = Directions.Kyiv;
                break;
        }
    }

    public void setArrivalTime() {
        this.arrivalTime = LocalDateTime.now().plusDays(ThreadLocalRandom.current().nextInt(1, 5));
    }

    public void setDepartureTime() {
        this.departureTime = this.arrivalTime.plusHours(ThreadLocalRandom.current().nextInt(15, 30));
    }

    public void setDistance() {
        switch (ThreadLocalRandom.current().nextInt(1, 3)) {
            case 1:
                this.distance = 521;
                break;
            case 2:
                this.distance = 276;
                break;
            case 3:
                this.distance = 451;
                break;
        }
    }

    public void trainDataOutput() {
        long dep = departureTime.toEpochSecond(ZoneOffset.UTC);
        long arr = arrivalTime.toEpochSecond(ZoneOffset.UTC);
        if ((float) ((dep - arr) / 86400) >= 1) {
            System.out.println("No поезда - " + trainNumber);
            System.out.println("Направление - " + direction);
            System.out.println("Время прибытия - " + arrivalTime);
            System.out.println("Время отбытия - " + departureTime);
            System.out.println("Расстояние - " + distance);
            System.out.println();
        }
    }
}
