package edu.wgu.d387_sample_code.il8n;

import java.util.Locale;
import java.util.ResourceBundle;

public class DisplayMessage implements Runnable {

    private final Locale locale; // Make sure the locale field is private or protected

    // Constructor
    public DisplayMessage(Locale locale) {
        this.locale = locale;
    }

    // Instance method to get display message
    public String getDisplayMessage() {
        ResourceBundle bundle = ResourceBundle.getBundle("message", locale);
        return bundle.getString("welcome");
    }

    @Override
    public void run() {
        System.out.println("Thread ID: " + Thread.currentThread().getId() + " - " + getDisplayMessage());
    }
}
