package com.he.sampleApplication.models;

public class Room {
    private int roomNumber;
    private RoomType roomType;
    private boolean isAvailable;

    public Room(int roomNumber, RoomType roomType, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
    }

    // Getters and setters
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}