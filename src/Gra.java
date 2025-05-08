import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gra {
    private char[] plansza = new char[100];
    private List<Player> gracze; // lista graczy

    public Gra() {
        // Inicjalizacja planszy i graczy
        gracze = new ArrayList<>();
        Player gracz1 = new Player("Gracz 1", 1,100);
        gracze.add(gracz1);
    }

    public void wyswietlPlansze(){
        System.out.println("\nPlansza:");
        for (int i = 0; i < plansza.length; i++) {
            boolean zajete = false;
            for (Player gracz : gracze) {
                if(gracz.getPozycja() == i){
                    System.out.print(gracz.getName().charAt(0));
                    zajete = true;
                    break;
                }
            }
            
            if(!zajete){
                System.out.print("_");
            }

        }

    }
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
                    Player p = new Player(nick, wybor,0);
                    gracze.add(p);

                    break;
                case 2:
                    Player p2 = new Player(nick, wybor,0);
                    gracze.add(p2);

                    break;

                default:
                    System.out.println("Brak wybranej postaci.");
                    break;
            }
        }
        scanner.close();
    }
}
