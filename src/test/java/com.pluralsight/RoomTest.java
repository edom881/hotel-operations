package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    public void testCheckInAvailableRoom() {

        Room room = new Room(2, 150.00, false, false);

        boolean result = room.checkIn();

        assertTrue(result);
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }
}