package com.studentapp.model;

public class Student {
    private int id;
    private String name;
    private int attendance;

    public Student(int id, String name, int attendance) {
        this.id = id;
        this.name = name;
        this.attendance = attendance;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAttendance() { return attendance; }
}
