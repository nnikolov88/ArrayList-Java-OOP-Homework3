package fmi.informatics.extending;


import fmi.informatics.interfaces.Adaptable;

public class AnonymousOfAdaptable implements Adaptable {

    public void study() {
        System.out.println("The anonymous student doesn't study hard for Java Exams because He doesn't like Java.");
    }

    public void think() {
    	
    	System.out.println("The anonymous student doesn't think for Java because He wants to learn something more interesting.");
    }
    public void act() {
    	
    	System.out.println("The anonymous student doesn't act when He needs to send all of  his Java Homework.");

    }

}