//read a number from user and display even or odd
// continue the process until user enter -ve value or 0

import java.util.Scanner;

class EvenOdd {
    public static void main(String args[]) {
        int num;
        Scanner scan = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Enter a Number: ");
            num = scan.nextInt();

            if (num <= 0) {
                break;
            }
            if (num % 2 == 0) {
                System.out.println("Entered number is Even \n");
            } else {
                System.out.println("Entered number is Odd \n");
            }
        }
    }
}