package lv.acodemy.classroom;

import java.security.PublicKey;

public class MethodsExample {
    public static void main(String[] args) {
    printMyFullName();
    printMyFullName("John", "Doe");
    printMe("Jekaterina", "Cernobikina", 24);

    System.out.println(sum(20, 10));

    int twoNumberSum = sum(50, 60);
    System.out.println(twoNumberSum);

    System.out.println(multiplication(2, 2));

    int twoNumberMultiplication = multiplication(6, 4);
    System.out.println(twoNumberMultiplication);

    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    for (int i = numbers.length - 1; i >= 0; i--) {
        System.out.println(numbers[i] + " ");

    }
    }
    public static void printMyFullName() {
        System.out.println("Jekaterina Cernobikina");

    }

    public static void printMyFullName(String name, String lastName) {
        System.out.println(name + " " + lastName);
    }

    public static void printMe(String name, String lastName, int age) {
        System.out.println("My name is " + name);
        System.out.println("My lastName " + lastName);
        System.out.println("My age " + age);
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static boolean isPalindrome(String palindromeWord) {
        String word = "";

        for (int i = palindromeWord.length() - 1; i >= 0; i--) {
            word += palindromeWord.charAt(i);
        }
        System.out.println("Word = " + word);
        return word.equals(palindromeWord);
    }



}
