import java.util.Scanner;

public class DrawApp {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        switch(choice) {
            case 1:
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("* ");
                    }

                    System.out.println("*");
                }
                break;
            case 2:
                for (int i = 0; i <= 5; i++) {
                    for(int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
                for (int i = 0; i < 5; i++) {
                    for(int j = 0; j < 5 - i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 5:
                for (int i = 0; i < 5; i++) {
                    for(int j = 0; j< i; j++) {
                        System.out.print(" ");
                    }
//                    System.out.println(" ");
                    for(int j = 0; j< 5-i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 6:
//                for (int i = 0; i < 5; i++) {
//                    for(int j = 5; j > 0; j--) {
//                        System.out.print(" ");
//                    }
//                    for (int j = i+1; j > 0; j--) {
//                        System.out.print("*");
//
//                    }
//                    System.out.println(" ");
//                }
                for (int i = 0; i < 5; i++) {
                    for(int j = 0; j <= 5 - i; j++) {
                        System.out.print(" ");
                    }
                    for(int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
        }
    }
}
