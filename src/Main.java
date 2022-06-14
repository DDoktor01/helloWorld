import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("vvedite nomer mesiacha");
        int x;
        Scanner sc = new Scanner(System.in); // создание сканера
        x = sc.nextInt(); // считывание из консоли целого числа

            switch (x) {
                case 12:
                case 1:
                case 2:
                    System.out.println("winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("everlasting summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("fall");
                    break;
            }


    }
}