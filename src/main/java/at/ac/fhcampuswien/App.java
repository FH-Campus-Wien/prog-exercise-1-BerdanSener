package at.ac.fhcampuswien;

import java.io.InputStream;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        String ausgabe = "0123456789012345678901";
        ausgabe += "\n         __" +
                "\n _(\\    |@@|" +
                "\n(__/\\__ \\--/ __" +
                "\n   \\___|----|  |   __" +
                "\n       \\ }{ /\\ )_ / _\\" +
                "\n       /\\__/\\ \\__O (__" +
                "\n      (--/\\--)    \\__/" +
                "\n      _)(  )(_" +
                "\n     `---''---`";
        System.out.println(ausgabe);
    }

    //todo Task 3
    public void sumOfLiterals(){
        char buchstabe = 'Z';
        int hex1 = 0xface;
        int zahl1 = 012;
        long zahl2 = 80L;
        float zahl3 = 44e-1f;
        float zahl4 = 5.5f;
        double zahl5 = 8.88e1;
        double zahl6 = 99.9;

        int summe = (int) buchstabe + hex1 + zahl1 + (int) zahl2 + (int) zahl3 + (int) zahl4 + (int) zahl5 + (int) zahl6;
        System.out.println(""+summe);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        int zahl1 = sc.nextInt();
        int zahl2 = sc.nextInt();
        System.out.println((zahl1+zahl2)+"");
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Before Swap:\nx: ");
        int zahl1 = sc.nextInt();
        System.out.print("y: ");
        int zahl2 = sc.nextInt();
        zahl1 = zahl1 + zahl2;
        zahl2 = Math.abs(zahl2 - zahl1);
        zahl1 = Math.abs(zahl1 - zahl2);
        System.out.println("After Swap:\nx: "+zahl1+"\ny: "+zahl2);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("n1: ");
        int zahl1 = sc.nextInt();
        System.out.print("n2: ");
        int zahl2 = sc.nextInt();
        if(zahl1 == zahl2){
            System.out.println("n1 == n2");
            return;
        }
        if (zahl1 > zahl2 ){
            System.out.println("n1 > n2");
        }else {
            System.out.println("n2 > n1");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int zahl1 = sc.nextInt();
        if(zahl1 < 0 || zahl1 >= 100000){
            System.out.println("Invalid Revenue");
        } else if (zahl1 >= 0 && zahl1 <20000) {
            System.out.println("Poor Sales Revenue");
        } else if (zahl1 >= 20000 && zahl1 < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (zahl1 >= 50000 && zahl1 < 80000) {
            System.out.println("Good Sales Revenue");
        } else if (zahl1 >= 80000 && zahl1 < 100000) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int zahl1 = sc.nextInt();
        switch (zahl1){
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Year: ");
        int jahr = sc.nextInt();
        if (jahr%4 == 0 && (jahr%100 != 0 || jahr%400 == 0)){
            System.out.println("Leapyear");
        }else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int eingabe = sc.nextInt();
        int tmp = 0;
        while(eingabe != 0) {
            tmp = tmp*10 + eingabe % 10;
            eingabe /= 10;
        }
        System.out.println(tmp);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}