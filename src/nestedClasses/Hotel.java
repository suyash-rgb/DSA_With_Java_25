package nestedClasses;

public class Hotel { // Local Inner (method Local) class demo
    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reservedRooms(String guestName, int noOfRooms) {
        class ReservationValidator {

            boolean validate() {
                if (guestName == null || guestName.isBlank()) {
                    System.out.println("name should not be empty");
                    return false;
                }
                if (noOfRooms < 0) {
                    System.out.println("Num of rooms should be positive");
                    return false;
                }
                if (reservedRooms + noOfRooms > totalRooms) {
                    System.out.println("not enough rooms avalable");
                    return false;
                }
                return true;
            }
        }
        ReservationValidator validator = new ReservationValidator();
        if (validator.validate()) {
            reservedRooms += noOfRooms;
            System.out.println("Room reserved successfully");
        } else {
            System.out.println("Reservastion failed");
        }
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel("Birla Sunshine", 10, 5);
        hotel.reservedRooms("Shubham", 6);
    }
}
