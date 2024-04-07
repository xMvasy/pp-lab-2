import java.util.Arrays;
import java.util.Scanner;

public class SredniaOcenZTablicy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] przedmioty = {"archeologia", "informatyka", "biologia", "WF", "matematyka", "fizyka", "polski", "historia", "plastyka", "geografia"};
        
        int sumaOcen = 0;
        int liczbaOcen = 0;

        for (String przedmiot : przedmioty) {
            System.out.print("Ile ocen chcesz wprowadzić dla " + przedmiot + "? ");
            int[] oceny = new int[scanner.nextInt()];
            wprowadzIWyswietlOceny(oceny, scanner, przedmiot);
            sumaOcen += sumaOcen(oceny);
            liczbaOcen += oceny.length;
            double mediana = obliczMedianę(oceny);
            System.out.printf("Mediana ocen z %s: %.2f\n\n", przedmiot, mediana);
        }
        
        double srednia = sumaOcen / (double) liczbaOcen;
        System.out.printf("Średnia wszystkich ocen wynosi: %.2f\n", srednia);
    }
    
    private static void wprowadzIWyswietlOceny(int[] oceny, Scanner scanner, String przedmiot) {
        int suma = 0;
        System.out.println("Wprowadzanie ocen z " + przedmiot + ":");
        for (int i = 0; i < oceny.length; i++) {
            int ocena;
            do {
                System.out.printf("Podaj ocenę nr %d (1-6): ", i + 1);
                ocena = scanner.nextInt();
                if (ocena < 1 || ocena > 6) {
                    System.out.println("Błędna ocena. Podaj ocenę w skali od 1 do 6.");
                }
            } while (ocena < 1 || ocena > 6);
            
            oceny[i] = ocena;
            suma += ocena;
        }
        
        Arrays.sort(oceny);
        
        System.out.print("Wprowadzone oceny z " + przedmiot + ": ");
        for (int ocena : oceny) {
            System.out.print(ocena + " ");
        }
        System.out.println("\nSuma ocen z " + przedmiot + ": " + suma);
        System.out.printf("Średnia ocen z %s: %.2f\n\n", przedmiot, suma / (double)oceny.length);
    }
    
    private static double sumaOcen(int[] oceny) {
        int suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        return suma;
    }
    
    private static double obliczMedianę(int[] oceny) {
        int dlugosc = oceny.length;
        if (dlugosc % 2 == 0) {
            return (oceny[dlugosc / 2 - 1] + oceny[dlugosc / 2]) / 2.0;
        } else {
            return oceny[dlugosc / 2];
        }
    }
}