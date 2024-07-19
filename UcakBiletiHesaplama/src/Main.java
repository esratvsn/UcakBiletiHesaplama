import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        yolculukTipi = input.nextInt();

        if (mesafe < 0 || yas < 0 || (yolculukTipi != 1) && (yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        double normalTutar= mesafe * 0.10, indirimliTutar=0;

        if (yas < 12) {
            indirimliTutar = normalTutar * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            indirimliTutar = normalTutar * 0.90;
        } else if (yas > 65) {
            indirimliTutar = normalTutar * 0.70;
        }

        if (yolculukTipi == 2) {
            indirimliTutar *= 0.80;
        }

        double toplamTutar = yolculukTipi == 2 ? indirimliTutar * 2 : indirimliTutar;

        // Sonuçları ekrana yazdır
        System.out.printf("Toplam Tutar = %.2f TL\n", toplamTutar);

    }
}