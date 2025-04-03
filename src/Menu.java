import java.util.Scanner;

public class Menu {
    static String[] options = { "Rozpocznij gre ", "Ustaw ilosc graczy", "Wyjdz z gry", };

    public static void showMainMenu() {
        int i = 0;
        for (String zawartoscOptions : options) {
            i++;
            System.out.println(zawartoscOptions + " " + i);
        }
        System.out.print("Wybierz opcję: ");

    }

    public static void startGame() {

        Scanner scanner = new Scanner(System.in);
        showMainMenu();
        int opcje = scanner.nextInt();
        int lOptions = options.length;
        while (opcje != lOptions) {
            showMainMenu();
            opcje = scanner.nextInt();

            switch (opcje) {
                case 1:
                    // rozpocznij rozgrywke
                    
                    System.out.print("\033[H\033[2J"); //czyści terminal 
                    Scanner sPostac = new Scanner(System.in);
                    System.out.println("Wybierz swoj nick: ");
                    String name =  sPostac.nextLine();
                    System.out.print("Wybierz postać (1 - Łowca;2 - Wojownik): ");
                    int wyborPostaci = sPostac.nextInt();
                    Player gracz = new Player(name,wyborPostaci);
                    System.out.println("Gra rozpoczęta!");


                    break;

                case 2:
                    // ustaw ilosc graczy

                    break;

                default:
                    System.out.println("Taka opcja nie istnieje.");
                    break;
            }

        }

    }
}
