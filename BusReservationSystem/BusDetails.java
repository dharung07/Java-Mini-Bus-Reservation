package BusReservationSystem;

public class BusDetails {
    private int busNumber;
    private int seatCapacity;

    BusDetails(int busNo, int capacity) {
        this.busNumber = busNo;
        this.seatCapacity = capacity;
    }

    public void PrintBusDetail() {
        System.out.println("Bus No. : " + busNumber + " ; Seat Capacity : " + seatCapacity);
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public int getBusNumber() {
        return busNumber;
    }
}
