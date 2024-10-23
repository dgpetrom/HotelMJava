package com.he.sampleApplication.models;

public class Reservation {
    private int reservationId;
    private String guestName;
    private String checkInDate;
    private String checkOutDate;
    private Room reservedRoom;

    public Reservation(int reservationId, String guestName, String checkInDate, String checkOutDate,
            Room reservedRoom) {
        this.reservationId = reservationId;
        this.guestName = guestName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.reservedRoom = reservedRoom;
    }

    // Getters and setters
    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Room getReservedRoom() {
        return reservedRoom;
    }

    public void setReservedRoom(Room reservedRoom) {
        this.reservedRoom = reservedRoom;
    }
}