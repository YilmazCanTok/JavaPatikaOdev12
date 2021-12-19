

import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kademe;
        System.out.println("****************************************************");
        System.out.println("Yıldızlarla Ters Üçgen Oluşturma");
        System.out.println("----------------------------------------------------");
        System.out.print("Kademe Sayısını Yazınız : ");
        kademe = scanner.nextInt();
        System.out.println("");
        
        for (int i = kademe; i >= 0; i--) {
            for (int j = kademe-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int k = (2*i)-1; k >=1 ; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("----------------------------------------------------");
        System.out.println("****************************************************");
    }
}
