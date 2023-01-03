package programmingintro;


import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hi, "+ name);

        System.out.println("What is your hobby?");
        String hobby = scanner.nextLine();

        System.out.println(name + ", your hobby is awesome :)");
    }
}