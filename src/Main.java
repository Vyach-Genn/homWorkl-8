import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1
        {
            // task a
            System.out.println("Task 1");
            int[] number = new int[3];
            number[0] = 1;
            number[1] = 2;
            number[2] = 3;
            // task b
            double[] number2 = {1.57, 7.654, 9.986};
            // task d
            boolean[] comparison = new boolean[2];
            comparison[0] = false;
            comparison[1] = true;
            System.out.println();

            // Task 2

            System.out.println("Task 2");
            // task a
            System.out.println(number[0] + ", " + number[1] + ", " + number[2]);
            // task b
            for (int i = 0; i < number2.length; i++) {
                if (i == number2.length - 1) {
                    System.out.println(number2[number2.length - 1]);
                    break;
                }
                System.out.print(number2[i] + ", ");
            }
            // task d
            boolean one = comparison[0];
            boolean two = comparison[1];
            System.out.println(one + ", " + two);
            System.out.println();

            System.out.println("Task 3");

            // task a
            System.out.println(number[2] + ", " + number[1] + ", " + number[0]);
            // task b
            for (int i = number2.length - 1; i >= 0; i--) {
                if (i == 0) {
                    System.out.println(number2[0]);
                    break;
                }
                System.out.print(number2[i] + ", ");
            }
            // task d
            one = comparison[0];
            two = comparison[1];
            System.out.println(two + ", " + one);
            System.out.println();

            // Task 4
            System.out.println("Task 4");

            for (int i = 0; i < number.length; i++) {
                if (number[i] % 2 != 0) {
                    number[i] += 1;
                }
            }
            System.out.println(Arrays.toString(number));
        }

    }
}