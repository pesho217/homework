package Arrays;

import java.util.Scanner;

public class uprborov {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Въведете обем на резервоара м/у 10 и 9999 литра");
        int capacity = input.nextInt();

        if (capacity >= 10 && capacity <= 9999) {

            int count = capacity / 5;
            int rest = capacity % ((capacity / 5) * 5);

            if (rest == 0) {
                System.out.println(count + " пъти от 2 литра");
                System.out.println("+");
                System.out.println(count + " пъти по 3 литра");
            }
            if (rest == 1) {
                System.out.println(count - 1 + " пъти по 2 литра");
                System.out.println("+");
                System.out.println(count + 1 + " пъти по 3 литра");
            }
            if (rest == 2) {
                System.out.println(count + 1 + " пъти по 2 литра");
                System.out.println("+");
                System.out.println(count + " пъти по 3 литра");
            }
            if (rest == 3) {
                System.out.println(count + " пъти по 2 литра");
                System.out.println("+");
                System.out.println(count + 1 + " пъти по 3 литра");
            }
            if (rest == 4) {
                System.out.println(count + 2 + " пъти по 2 литра");
                System.out.println("+");
                System.out.println(count + " пъти по 3 литра");
            }

            System.out.println("-------------------------");
            System.out.println("Резервоар от " + capacity + " литра");
        } else {
            System.out.println("Този резервоар е със странни размери!");
        }

    }
}
