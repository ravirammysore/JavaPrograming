package com.first;

import java.text.MessageFormat;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        String emailId = "sam@gmail.com";

        int position = emailId.indexOf("@");
        String email = emailId.substring(0, position);

        String today = Calendar.getInstance().getTime().toString();
        String msg =
                MessageFormat.format(
                        "Welcome to our site Mr.{0}! " +
                                "Today is {1}, weather is {2}",
                        email,today, 23);

        System.out.println(msg);
    }
}
