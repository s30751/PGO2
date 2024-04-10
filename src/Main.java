import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WItaj w muzeum");

        System.out.println("Podaj mistao");
        String miasto = scanner.nextLine();

        System.out.println("Podaj swój wiek");
        int wiek = scanner.nextInt();

        System.out.println("Czy odwiedzający jest mieszkańcem Warszawy ? (tak/nie)");
        boolean mieszkaniec = scanner.next().equalsIgnoreCase("tak");

        System.out.println("Czy dziś jest dzień tygodnia ? (tak/nie)");
        boolean dzien = scanner.next().equalsIgnoreCase("tak");

        double cenaBiletu = 40.0;
        double znizka = 0.0;

        if (wiek < 10) {
            znizka += cenaBiletu;
            System.out.println("Odwiedzający ma mniej niż 10 lat - wejście darmowe" );
        } else if (wiek >= 10 && wiek<= 18) {
            znizka += cenaBiletu*0.5;
            System.out.println("Odwiedzający jest pomiędzy 10 a 18 rokiem życia - 50% zniżki");
        }

        if (mieszkaniec) {
            znizka += cenaBiletu*0.1;
            System.out.println("Odwiedzający jest mieszkacem Warszawy - dodatkowe 10% zniżki");
        }
        if (dzien) {
            znizka = cenaBiletu;
            System.out.println(" ");
        }

        double koncowaCena = cenaBiletu;
        System.out.println("Dane: " + miasto + ", " + wiek + " lat, ");
        System.out.println("Cena biletu: " + koncowaCena + " PLN");
        System.out.println("Zniżka: " + (znizka/cenaBiletu*100) + "%");
    }
}