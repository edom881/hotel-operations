package com.pluralsight;
public class Main {



        public static void main(String[] args) {

            // ROOM TEST
            Room room1 = new Room(2, 150.00, false, false);

            System.out.println("ROOM TEST");
            System.out.println("Beds: " + room1.getNumberOfBeds());
            System.out.println("Price: $" + room1.getPrice());
            System.out.println("Occupied: " + room1.isOccupied());
            System.out.println("Dirty: " + room1.isDirty());
            System.out.println("Available: " + room1.isAvailable());

            System.out.println();


            // RESERVATION TEST
            Reservation reservation1 = new Reservation("king", 3, true);

            System.out.println("RESERVATION TEST");
            System.out.println("Room type: " + reservation1.getRoomType());
            System.out.println("Price per night: $" + reservation1.getPrice());
            System.out.println("Number of nights: " + reservation1.getNumberOfNights());
            System.out.println("Weekend: " + reservation1.isWeekend());
            System.out.println("Reservation total: $" + reservation1.getReservationTotal());

            System.out.println();


            // EMPLOYEE TEST
            Employee employee1 = new Employee(101, "Sara", "Front Desk", 20.00, 45);


            System.out.println("Regular hours: " + employee1.getRegularHours());
            System.out.println("Overtime hours: " + employee1.getOvertimeHours());
            System.out.println("Total pay: $" + employee1.getTotalPay());

            System.out.println();


            // HOTEL TEST
            Hotel hotel1 = new Hotel("Dallas Hotel", 5, 10);

            System.out.println("HOTEL TEST");
            System.out.println("Hotel name: " + hotel1.getName());

            System.out.println("Available suites: " + hotel1.getAvailableSuites());
            System.out.println("Available basic rooms: " + hotel1.getAvailableRooms());

            boolean suiteBooked = hotel1.bookRoom(2, true);

            System.out.println("Booked 2 suites: " + suiteBooked);
            System.out.println("Suites left: " + hotel1.getAvailableSuites());

            boolean roomBooked = hotel1.bookRoom(3, false);

            System.out.println("Booked 3 basic rooms: " + roomBooked);
            System.out.println("Basic rooms left: " + hotel1.getAvailableRooms());
        }
    }
