package KeyTester;

import java.util.Scanner;

public class KeyTester {
    public static void main(String[] args) {
        int i = 0;
        for(;i < 9;)
            i = loopIn();

        }

    public static int loopIn(){
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (true) {
            try {
                System.out.print("input integer: ");
                option = scanner.nextInt();
                System.out.println("you entered: " + option);
                break;
            }catch (Exception e){
                System.out.print("\nwrong format, try again and do it right: ");
                scanner.next();
            }

        }

        return option;
    }

    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }

    }