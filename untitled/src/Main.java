package com.vogella.unittest.services;

public class Main {

    // Other methods omitted for brevity

    public boolean update() {
        try {
            // Simulate a long-running process
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
