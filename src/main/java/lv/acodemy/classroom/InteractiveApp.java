package lv.acodemy.classroom;

import java.util.Scanner;

public class InteractiveApp {
    public static void main(String[] args) {
    Scanner chatBot = new Scanner(System.in);
    System.out.println("What is your name?");
        String name = chatBot.next();

        System.out.println("What is your last name?");
        String lastName = chatBot.next();

        System.out.printf("Hello %s %s. My name is Bot Alex K. How can I help you?%n", name , lastName);

        System.out.println("Press 1 for registration or press 2 to stop chap");
        byte answer = chatBot.nextByte();


        if(answer == 1) {
            System.out.println("Please enter the date in following format: (dd-MM-yyyy)");
            String registrationDate = chatBot.next();
            System.out.println("You've  registered on date:" + registrationDate);
        } else if (answer == 2) {
            System.out.println("OK, this chat bill be closed now!");
            chatBot.close();
        } else {
            System.out.println("Option is not correct! Try again!");
        }
    }
}
