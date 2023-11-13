/* Напишете програма, която:

//// 1. Чете за име на потребител
//// 2. Чете за любимо хоби на потребителя
//// 3. Изписва в конзолата подходящо съобщение за потребителя и хобито
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("What is your hobby?");

        Scanner scanner1 = new Scanner(System.in);

        String hobby = scanner.nextLine();

        System.out.println( hobby + " is so cool! I wish I had a hobby like you " + name + " !" );

    }
}