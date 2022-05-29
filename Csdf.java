import java.util.Scanner;

public class Csdf {
    public static void main(String[] args) {

        int matematik,fizik,kimya,turkce,tarih,muzik;
        Scanner gir = new Scanner(System.in);

        System.out.printf("Matematik Not Giriniz :");
        matematik = gir.nextInt();


         System.out.printf("Fizik Not Giriniz :");
         fizik = gir.nextInt();
          System.out.printf("Kimya Not Giriniz :");
          kimya = gir.nextInt();
            System.out.printf("Turkce Not Giriniz :");
            turkce = gir.nextInt();
              System.out.printf("Tarih Not Giriniz :");
              tarih = gir.nextInt();
                System.out.printf("Muzik Not Giriniz :");
                muzik = gir.nextInt();


                System.out.printf("Ortalamaniz = ");
                Double ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6.0;
                System.out.println(ortalama);

               Boolean not = ortalama>= 60;
                       String sonuc = ((not) ? "Sinifi Gectiniz" : "Sinifta Kaldiniz");
                System.out.println(sonuc);



    }
}
