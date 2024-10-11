//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin");
       int tek = scan.nextInt();
       if (tek%2==0){
           System.out.println("Lirdiğiniz sayı çift");
       }else{
           System.out.println("Lirdiğiniz sayı tek");
       }







    }
}