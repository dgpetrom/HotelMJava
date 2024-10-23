package com.he.sampleApplication.sample;

import com.he.sampleApplication.models.*;
import com.he.sampleApplication.HotelManagementSystem;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class sampleTest {
    private HotelManagementSystem hotelSystem;
    private Reservation reservation1;
    private Reservation reservation2;
    private Room room1;
    private Room room2;

    @Before
    public void setUp() {
        hotelSystem = new HotelManagementSystem();
        room1 = new Room(101, RoomType.SINGLE, true);
        room2 = new Room(201, RoomType.DOUBLE, true);
        hotelSystem.getRooms().add(room1);
        hotelSystem.getRooms().add(room2);
        reservation1 = new Reservation(1, "John Doe", "2024-02-10", "2024-02-15", room1);
        reservation2 = new Reservation(2, "Jane Doe", "2024-02-12", "2024-02-18", room2);
        hotelSystem.reserveRoom(reservation1);
        hotelSystem.reserveRoom(reservation2);
    }

    @Test
    public void testCheckRoomAvailability() {
        List<Room> availableRooms = hotelSystem.checkRoomAvailability("2024-02-16", "2024-02-20");
        assertEquals(1, availableRooms.size());
    }

    @Test
    public void testFindReservationsByGuestName() {
        List<Reservation> guestReservations = hotelSystem.findReservationsByGuestName("John Doe");
        assertEquals(1, guestReservations.size());
        assertEquals("John Doe", guestReservations.get(0).getGuestName());
    }

    @Test
    public void testCalculateTotalRevenue() {
        double totalRevenue = hotelSystem.calculateTotalRevenue();
        assertEquals(250.0, totalRevenue, 0.001);
    }
}
