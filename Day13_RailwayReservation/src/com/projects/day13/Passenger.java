package com.projects.day13;

public class Passenger {
	
	int seatNo;
    String name;
    int age;
    int trainNo;

    public Passenger(int seatNo, String name, int age, int trainNo) {
        this.seatNo = seatNo;
        this.name = name;
        this.age = age;
        this.trainNo = trainNo;
    }

    @Override
    public String toString() {
        return "Seat No: " + seatNo +
               ", Name: " + name +
               ", Age: " + age +
               ", Train No: " + trainNo;
    }
}



