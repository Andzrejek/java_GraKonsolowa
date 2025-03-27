// Uzupełnij klasę Łowca w analogiczny sposób jak klasę Wojownik.

import java.util.Random;

public class Łowca extends Postac {


    // Konstruktor klasy Łowca
    public Łowca(int zdrowie,int energi,int pozycja){
        super(zdrowie, energi, pozycja);
    }
    
    // Implementacja metody ciosLekki
    @Override
    public void ciosLekki(){
        Random rand = new Random();
        if (energia >= 10) {
            System.out.println("Łowca wykonuje cios lekki!");
            energia -= 10;
            // Tutaj można dodać logikę zadawania obrażeń przeciwnikowi
            System.out.println("Łowca zadał: " + rand.nextInt(26));
            System.out.println("Łowcy zostało: " + energia + " energi");
        } else {
            System.out.println("Za mało energii na cios lekki!");
        }

    }
    

    // Implementacja metody ciosMocny
    @Override
    public void ciosMocny(){
        if (energia >= 20) {
            System.out.println("Łowca wykonuje cios mocny!");
            energia -= 20;
            // Tutaj można dodać logikę zadawania większych obrażeń przeciwnikowi
        } else {
            System.out.println("Za mało energii na cios mocny!");
        }

    }

    // Implementacja metody leczenie
    @Override
    public void leczenie(){
        if (energia >= 15) {
            System.out.println("Łowca leczy się!");
            zdrowie += 20;
            energia -= 15;
            if (zdrowie > 100) zdrowie = 100; // Zdrowie nie może przekroczyć 100
        } else {
            System.out.println("Za mało energii na leczenie!");
        }

    }

    // Implementacja metody poruszanie
    @Override
    public void poruszanie(int nowaPozycja){
         if (nowaPozycja >= 0 && nowaPozycja <= 100) {
            pozycja = nowaPozycja;
            System.out.println("Łowca porusza się na pozycję " + pozycja);
        } else {
            System.out.println("Nieprawidłowa pozycja!");
        }
    

    }
    
}
