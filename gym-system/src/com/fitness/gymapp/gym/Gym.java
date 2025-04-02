package com.fitness.gymapp.gym;

public class Gym {
    public String name;
    public String location;
    public String owner;

    public void gymDetails() {
        System.out.println("\nGym Details:");
        System.out.println("Gym Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Owner: " + this.owner);
    }
}
