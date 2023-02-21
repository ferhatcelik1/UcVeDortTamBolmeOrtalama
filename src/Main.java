import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k ;
        int toplam = 0, sayac = 0;
        Scanner input = new Scanner(System.in);

        System.out.print(" sayı giriniz :");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 12 == 0) {
                sayac += 1;
                toplam += k;

                System.out.println(i);

            }
        }
        double ortalama = (toplam / sayac);
        System.out.println(ortalama);
    }
}
