package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HumanReadableTime.makeReadable(0);
        HumanReadableTime.makeReadable(5);
        HumanReadableTime.makeReadable(60);
        HumanReadableTime.makeReadable(86399);
        HumanReadableTime.makeReadable(359999);
    }

    public static class HumanReadableTime {
        public static String makeReadable(int seconds) {
            // Do something
            

            return Integer.toString(seconds);
        }
    }
}
