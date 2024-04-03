package BusReservationSystem;
import java.util.*;
import java.util.ArrayList;
public class BusReservationMain {
    public static void main(String[] args) {
        int userInput = 1;
        Scanner scanner = new Scanner(System.in);

        ArrayList<BusDetails> busDetailsStorage = new ArrayList<BusDetails>();
        ArrayList<GetBookingDetails> bookingsStorage = new ArrayList<GetBookingDetails>();

        busDetailsStorage.add(new BusDetails(1,1));
        busDetailsStorage.add(new BusDetails(2,2));

        for(BusDetails bus:busDetailsStorage) {
            bus.PrintBusDetail();
        }

        while(userInput == 1) {
            System.out.println("Enter 1 for Booking 2 for Exit : ");
            userInput = scanner.nextInt();
            GetBookingDetails newBooking = new GetBookingDetails();
            if(newBooking.available(bookingsStorage,busDetailsStorage)) {
                bookingsStorage.add(newBooking);
                System.out.println("You Booked Bus No. : " + newBooking.busNumber + " on " + newBooking.date);
            }
            else {
                System.out.println("Sorry Bus is not Available");
                System.out.println("Try another date or bus");
            }
        }
    }
}
