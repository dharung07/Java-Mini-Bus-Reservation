package BusReservationSystem;
import java.util.*;
import java.text.*;
public class GetBookingDetails {
    String name;
    Date date;
    int busNumber;

    GetBookingDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = scanner.next();
        System.out.println("Enter Bus Number to reserve : ");
        busNumber = scanner.nextInt();
        System.out.println("Enter a Date (DD-MM-YYYY) : ");
        String dateString = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
        try {
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean available(ArrayList<GetBookingDetails> bookingsStorage, ArrayList<BusDetails> busesStorage) {
        int getSelectedBusSeatCapacity = 0;
        for(BusDetails b:busesStorage) {
            if(b.getBusNumber() == busNumber)
                getSelectedBusSeatCapacity = b.getSeatCapacity();
        }

        int currentBooking = 0;
        for(GetBookingDetails iPastBookingDetail:bookingsStorage) {
            if(iPastBookingDetail.busNumber == busNumber && (iPastBookingDetail.date).equals(date))
                currentBooking++;
        }

        return currentBooking < getSelectedBusSeatCapacity;
    }
}
