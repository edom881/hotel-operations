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
    @Test
    public void testCannotCheckInOccupiedRoom() {

        Room room = new Room(2, 150.00, true, false);

        boolean result = room.checkIn();

        assertFalse(result);
    }
    @Test
    public void testCannotCheckInDirtyRoom() {

        Room room = new Room(2, 150.00, false, true);

        boolean result = room.checkIn();

        assertFalse(result);
    }
    @Test
    public void testCheckout() {

        Room room = new Room(2, 150.00, true, true);

        room.checkout();

        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
    }
    @Test
    public void testCleanRoom() {

        Room room = new Room(2, 150.00, false, true);

        boolean result = room.cleanRoom();

        assertTrue(result);
        assertFalse(room.isDirty());
    }
    @Test
    public void testCannotCleanOccupiedRoom() {

        Room room = new Room(2, 150.00, true, true);

        boolean result = room.cleanRoom();

        assertFalse(result);
    }








    }
