package org.example.creational.factory;

public interface Document {
    void open();
}

class PDF implements Document{

    @Override
    public void open() {
        System.out.println("Opened a PDF");
    }

}

class Word implements Document{

    @Override
    public void open() {
        System.out.println("Opened a Word");
    }

}

class HTML implements Document{

    @Override
    public void open() {
        System.out.println("Opened a HTML");
    }

}