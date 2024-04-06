import java.util.Scanner;

public class SredniaOcenZTablicy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ile ocen chcesz wprowadzić dla archeologii? ");
        int[] archeologia = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla informatyki? ");
        int[] informatyka = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla biologia? ");
        int[] biologia = new int[scanner.nextInt()];

        System.out.print("Ile ocen chcesz wprowadzić dla WF? ");
        int[] WF = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla matematyki? ");
        int[] matematyka = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla fizyki? ");
        int[] fizyka = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla polskiego? ");
        int[] polski = new int[scanner.nextInt()];

        System.out.print("Ile ocen chcesz wprowadzić dla historii? ");
        int[] historia = new int[scanner.nextInt()];

        System.out.print("Ile ocen chcesz wprowadzić dla plastyka? ");
        int[] plastyka = new int[scanner.nextInt()];

        System.out.print("Ile ocen chcesz wprowadzić dla geografia? ");
        int[] geografia = new int[scanner.nextInt()];
        
        wprowadzIWyswietlOceny(archeologia, scanner, "archeologia");
        wprowadzIWyswietlOceny(informatyka, scanner, "informatyka");
        wprowadzIWyswietlOceny(biologia, scanner, "biologia");
        wprowadzIWyswietlOceny(wf, scanner, "wf");
        wprowadzIWyswietlOceny(matematyka, scanner, "matematyka");
        wprowadzIWyswietlOceny(fizyka, scanner, "fizyka");
        wprowadzIWyswietlOceny(polski, scanner, "polski");
        wprowadzIWyswietlOceny(historia, scanner, "historia");
        wprowadzIWyswietlOceny(plastyka, scanner, "plastyka");
        wprowadzIWyswietlOceny(geografia, scanner, "geografia");
        
        double suma = sumaOcen(archeologia) + sumaOcen(informatyka) + sumaOcen(biologia) + sumaOcen(wf) + sumaOcen(matematyka) + sumaOcen(fizyka) + sumaOcen(polski) + sumaOcen(historia) + sumaOcen(plastyka) + sumaOcen(geografia);
        int liczbaOcen = informatyka.length + wf.length + matematyka.length + fizyka.length + polski.length;
        double srednia = suma / liczbaOcen;
        
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
}