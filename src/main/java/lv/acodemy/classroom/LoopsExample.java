package lv.acodemy.classroom;

import java.util.Arrays;

public class LoopsExample {
    public static void main(String[] args) {
        int[] ages = {20, 18, 16, 16, 17, 18, 21};

        System.out.println(ages[4]);

        ages[3] = 10;
        System.out.println(ages[3]);

        System.out.println(Arrays.toString(ages));

        String[] day0fTheWeek = new String[8];
        day0fTheWeek[0] = "Monday";
        day0fTheWeek[1] = "Tuesday";
        day0fTheWeek[2] = "Wednesday";
        day0fTheWeek[3] = "Thursday";
        day0fTheWeek[4] = "Friday";
        day0fTheWeek[5] = "Saturday";
        day0fTheWeek[6] = "Sunday";

        System.out.println(Arrays.toString(day0fTheWeek));

        String[] names = {"John", "Alex", "Roman", "Natalya"};
        System.out.println(names[2]);


    }
}
