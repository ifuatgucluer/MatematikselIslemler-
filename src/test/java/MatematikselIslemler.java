import java.util.Scanner;

public class MatematikselIslemler {

    public static void main(String[] args) {

        // Kullanıcıdan 4 basamaklı bir tam sayı alıp rakamlar toplamını bulalım
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayı giriniz: ");
        int sayi = scan.nextInt();
        System.out.println("Girmiş olduğunuz sayı: " + sayi); // Örnek sayı: 4586

        int birlerBasamagi = sayi % 10;
        System.out.println("birlerBasamagi = " + birlerBasamagi);
        sayi = sayi / 10; // Örnek sayı: 458

        int onlarBasamagi = sayi % 10;
        System.out.println("onlarBasamagi = " + onlarBasamagi);
        sayi = sayi / 10; // Örnek sayı: 45

        int yuzlerBasamagi = sayi % 10;
        System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);
        sayi = sayi / 10; // Örnek sayı: 4

        int binlerBasamagi = sayi % 10;
        System.out.println("binlerBasamagi = " + binlerBasamagi);

        int rakamlarToplami = birlerBasamagi + yuzlerBasamagi + onlarBasamagi + binlerBasamagi;
        System.out.println("Girilen Sayının Rakamları Toplamı = " + rakamlarToplami);
    }
}
