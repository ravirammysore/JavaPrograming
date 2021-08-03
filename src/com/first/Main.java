package com.first;

public class Main {

    public static void main(String[] args) {
        String name ="America";
        boolean letterFound = false;
        for (int i=0; i<name.length(); i++) {
            if (name.charAt(i) == 'd') {
                letterFound = true;
            }
        }
        System.out.println("Letter found: " + letterFound);
    }
}
