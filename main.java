import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int archeologia, informatyka, biologia, WF, matematyka, fizyka, polski, historia, plastyka, geografia;

        System.out.print("Podaj ocenę z archeologii: ");
        archeologia = scanner.nextInt();

        System.out.print("Podaj ocenę z informatyki: ");
        informatyka = scanner.nextInt();

        System.out.print("Podaj ocenę z biologii: ");
        biologia = scanner.nextInt();

        System.out.print("Podaj ocenę z WF: ");
        WF = scanner.nextInt();

        System.out.print("Podaj ocenę z matematyki: ");
        matematyka = scanner.nextInt();

        System.out.print("Podaj ocenę z fizyki: ");
        fizyka = scanner.nextInt();

        System.out.print("Podaj ocenę z polskiego: ");
        polski = scanner.nextInt();

        System.out.print("Podaj ocenę z historii: ");
        historia = scanner.nextInt();

        System.out.print("Podaj ocenę z plastyki: ");
        plastyka = scanner.nextInt();

        double srednia = (archeologia + informatyka + biologia + WF + matematyka + fizyka + polski + historia + plastyka + geografia) / 10.0;

        System.out.printf("Średnia ocen wynosi: %.2f", srednia);
    }
}