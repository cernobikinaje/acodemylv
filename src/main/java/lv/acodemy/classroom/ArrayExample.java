package lv.acodemy.classroom;

import java.util.Arrays;

public class ArrayExample {
     public static void main(String[] args) {
          for(int i = 0; i < 5; i++) {
               System.out.println("Hello World!");
          }

          for (int i = 0; i <= 20; i++) {
               if (i % 2 == 0) {
                    System.out.print(i + " ");

               }
          }
          System.out.println();

          String[] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
          for (int i = 0; i < dayOfTheWeek.length; i++) {
               System.out.println(dayOfTheWeek[i]);

          }

          for (int i = 0; i <= 4; i ++) {
               System.out.print(dayOfTheWeek[i] + " ");
          }

          for (String day : dayOfTheWeek) {
               if (day.equals("Friday")) {
                    System.out.println("Friday exit!");
                    break;
               }
          }

          for (int i = 10; i >= 0; i --) {
              System.out.println(i);
          }

          System.out.println();

          int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

          for (int i = numbers.length - 1; i >= 0; i--) {
               System.out.println(numbers[i] + " ");
          }
          System.out.println();

          int number = 0;
          while (number < 5) {
               System.out.println("Hello World!");
               number++;
          }

          number = 0;
          System.out.println();

          do {
               System.out.println("Hello World!");
               number++;
          } while (number < 5);

     }

     }

