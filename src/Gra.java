import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gra {
    private char[] plansza = new char[100];
    private List<Player> gracze; // lista graczy

    public void inicjalizujGre(int liczbaGraczy) {
        // inicjalizacja planszy
        for (int i = 0; i < 100; i++) {
            plansza[i] = '_';
        }

        // inicjalizacja graczy
        gracze = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < liczbaGraczy; i++) {
            System.out.println("Podaj swój nick: ");
            String nick = scanner.nextLine();
            System.out.println("Wybierz postać dla gracza " + (i + 1) + ":");
            System.out.println("1. Wojownik");
            System.out.println("2. Lowca");
            int wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    Player p = new Player(nick, wybor);
                    gracze.add(p);

                    break;
                case 2:
                    Player p2 = new Player(nick, wybor);
                    gracze.add(p2);

                    break;

                default:
                    System.out.println("Brak wybranej postaci.");
                    break;
            }
        }
    }
}
