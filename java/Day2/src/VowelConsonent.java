import java.util.Scanner;

class VowelConsonent {
    public static void main(String args[]) {
        String input;
        System.out.println("Enter Input: ");
        Scanner scan = new Scanner(System.in);
        input = scan.next();

        char ch = input.charAt(0);
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.print("Entered input is an Alphabet and ");

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("It's a Vowel");
            } else {
                System.out.println("It's a Consonent");
            }

        } else {
            System.out.println("Entered input is not an Alphabet");
        }


    }
}