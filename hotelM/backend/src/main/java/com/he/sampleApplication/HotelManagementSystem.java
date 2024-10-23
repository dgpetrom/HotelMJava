package com.he.sampleApplication;

import com.he.sampleApplication.models.Reservation;
import com.he.sampleApplication.models.Room;
import com.he.sampleApplication.models.RoomType;

import java.util.ArrayList;
import java.util.List;

public class HotelManagementSystem {
    private List<Reservation> reservations;
    private List<Room> rooms;

    public HotelManagementSystem() {
        this.reservations = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }

    // Operation 1: Check Room Availability for a Specific Date Range
    public List<Room> checkRoomAvailability(String startDate, String endDate) {
        // Complete code here
        return null;
    }

    // Operation 2: Find Reservations by Guest Name
    public List<Reservation> findReservationsByGuestName(String guestName) {
        // Complete code here
        return null;
    }

    // Operation 3: Calculate Total Revenue Generated
    public double calculateTotalRevenue() {
        // Complete code here
        return 0.0;
    }

    // Operation 4: Reserve Room
    public void reserveRoom(Reservation reservation) {
        // Add reservation to the list of reservations
        // Complete code here
    }

    // Operation 5: Cancel Reservation
    public void cancelReservation(Reservation reservation) {
        // Remove reservation from the list of reservations
        // Complete code here
    }

    // Operation 6: Calculate Occupancy Rate
    public double calculateOccupancyRate() {
        // Complete code here
        // Occupancy = No. of reservations
        return 0.0;
    }

    // Operation 8: Check Room Availability for a Specific Date
    public boolean isRoomAvailable(Room room, String startDate, String endDate) {
        // Complete code here
        return false;
    }

    // Operation 7: Find Available Rooms by Type
    public List<Room> findAvailableRoomsByType(RoomType type, String startDate, String endDate) {
        // Complete code here
        // Hint: use isRoomAvailable method
        return null;
    }

    // Operation 9: Calculate Revenue for a Specific Date Range
    public double calculateRevenueForDateRange(String startDate, String endDate) {
        // Complete code here
        return 0.0;
    }

    // Operation 10: Find Reservations for a Specific Date Range
    public List<Reservation> findReservationsForDateRange(String startDate, String endDate) {
        // Complete code here
        return null;
    }

    // Operation 11: Find Reservations by Room Number
    public List<Reservation> findReservationsByRoomNumber(int roomNumber) {
        // Complete code here
        return null;
    }

    // Operation 12: Check Room Availability by Room Number
    public boolean isRoomAvailable(int roomNumber, String startDate, String endDate) {
        // Complete code here
        return false;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

}
