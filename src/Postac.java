// Klasa abstrakcyjna Postać, która będzie dziedziczona przez Wojownika i Łowca
public abstract class Postac {
    protected int zdrowie;
    protected int energia;
    protected int pozycja;

    // Konstruktor klasy Postać
    public Postac(int zdrowie, int energia, int pozycja) {
        this.zdrowie = zdrowie;
        this.energia = energia;
        this.pozycja = pozycja;
    }

    // Abstrakcyjne metody, które muszą być zaimplementowane w klasach pochodnych
    public abstract void ciosLekki();
    public abstract void ciosMocny();
    public abstract void leczenie();
    public abstract void poruszanie(int nowaPozycja);

    // Metoda do wyświetlania stanu postaci
    public void wyswietlStan() {
        System.out.println("Zdrowie: " + zdrowie);
        System.out.println("Energia: " + energia);
        System.out.println("Pozycja: " + pozycja);
    }
}
