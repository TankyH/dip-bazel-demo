package com.dip.demo.notification;

public class Notify {
    /**
     * fake notifier
     */
    public static void send(String message) {
        System.out.printf("sending purchase notify message to buyer: %s \n", message);
    }
}
