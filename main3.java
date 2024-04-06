import java.util.Scanner;

public class SredniaOcenZTablicy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ile ocen chcesz wprowadzić dla archeologii? ");
        int[] archeologia = new int[scanner.nextInt()];

        System.out.print("Ile ocen chcesz wprowadzić dla informatyki? ");
        int[] informatyka = new int[scanner.nextInt()];

        System.out.print("Ile ocen chcesz wprowadzić dla biologii? ");
        int[] informatyka = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla WF? ");
        int[] wf = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla matematyki? ");
        int[] matematyka = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla fizyki? ");
        int[] fizyka = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla polskiego? ");
        int[] polski = new int[scanner.nextInt()];

        System.out.print("Ile ocen chcesz wprowadzić dla historii? ");
        int[] historia = new int[scanner.nextInt()];

        System.out.print("Ile ocen chcesz wprowadzić dla platyki? ");
        int[] plastyka = new int[scanner.nextInt()];

        System.out.print("Ile ocen chcesz wprowadzić dla geografii? ");
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
            System.out.printf("Podaj ocenę nr %d: ", i + 1);
            oceny[i] = scanner.nextInt();
            suma += oceny[i];
        }
        
        System.out.print("Wprowadzone oceny z " + przedmiot + ": ");
        for (int ocena : oceny) {
            System.out.print(ocena + " ");
        }
        System.out.println("\n Suma ocen z " + przedmiot + ": " + suma);
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