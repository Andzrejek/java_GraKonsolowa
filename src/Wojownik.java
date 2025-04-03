import java.util.Random;

// Klasa Wojownik dziedzicząca po klasie Postać
public class Wojownik extends Postac {

    // Konstruktor klasy Wojownik
    public Wojownik(int zdrowie, int energia, int pozycja) {
        super(zdrowie, energia, pozycja);
    }

    // Implementacja metody ciosLekki
    @Override
    public void ciosLekki() {
        Random rand = new Random();
        if (energia >= 10) {
            System.out.println("Wojownik wykonuje cios lekki!");
            energia -= 10;
            // Tutaj można dodać logikę zadawania obrażeń przeciwnikowi
            System.out.println("Wojownik zadał: " + rand.nextInt(16));
            System.out.println("Wojownikowi zostało: " + energia + " energi");
        } else {
            System.out.println("Za mało energii na cios lekki!");
        }
    }

    // Implementacja metody ciosMocny
    @Override
    public void ciosMocny() {
        if (energia >= 20) {
            System.out.println("Wojownik wykonuje cios mocny!");
            energia -= 20;
            // Tutaj można dodać logikę zadawania większych obrażeń przeciwnikowi
        } else {
            System.out.println("Za mało energii na cios mocny!");
        }
    }

    // Implementacja metody leczenie
    @Override
    public void leczenie() {
        if (energia >= 15) {
            System.out.println("Wojownik leczy się!");
            zdrowie += 20;
            energia -= 15;
            if (zdrowie > 100)
                zdrowie = 100; // Zdrowie nie może przekroczyć 100
        } else {
            System.out.println("Za mało energii na leczenie!");
        }
    }

    // Implementacja metody poruszanie
    @Override
    public void poruszanie(int nowaPozycja) {
        if (nowaPozycja >= 0 && nowaPozycja <= 100) {
            pozycja = nowaPozycja;
            System.out.println("Wojownik porusza się na pozycję " + pozycja);
        } else {
            System.out.println("Nieprawidłowa pozycja!");
        }
    }
}
