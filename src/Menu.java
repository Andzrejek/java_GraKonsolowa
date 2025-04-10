import java.util.Scanner;

public class Menu {
    static String[] options = { "Rozpocznij gre ", "Ustaw ilosc graczy", "Wyjdz z gry", };

    public static void showMainMenu() {
        int i = 0;
        System.out.println("Opcje Menu: ");
        for (String zawartoscOptions : options) {
            i++;
            System.out.println(zawartoscOptions + " " + "[" + i + "]");
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

                    System.out.println("");
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Witaj w grze!"); // powitanie
                    Gra gra = new Gra();
                    gra.inicjalizujGre(2);

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
