package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(2, 150.00, false, false);

        System.out.println("ROOM TEST");
        System.out.println("Number of beds: " + room1.getNumberOfBeds());
        System.out.println("Room price: $" + room1.getPrice());
        System.out.println("Occupied: " + room1.isOccupied());
        System.out.println("Dirty: " + room1.isDirty());
        System.out.println("Available: " + room1.isAvailable());

        System.out.println();

        Reservation reservation1 = new Reservation("king", 3, true);

        System.out.println("RESERVATION TEST");
        System.out.println("Room type: " + reservation1.getRoomType());
        System.out.println("Price per night: $" + reservation1.getPrice());
        System.out.println("Number of nights: " + reservation1.getNumberOfNights());
        System.out.println("Weekend: " + reservation1.isWeekend());
        System.out.println("Reservation total: $" + reservation1.getReservationTotal());

        System.out.println();

        Employee employee1 = new Employee(101, "Sara", "Front Desk", 20.00, 45);

        System.out.println("EMPLOYEE TEST");
        System.out.println("Regular hours: " + employee1.getRegularHours());
        System.out.println("Overtime hours: " + employee1.getOvertimeHours());
        System.out.println("Total pay: $" + employee1.getTotalPay());
    }
}
