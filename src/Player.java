public class Player {
    // pola klasy
    String name;
    int postac;
    int pozycja;
    
    // konstruktor
    public Player(String name, int postac, int pozycja) {
        this.name = name;
        this.postac = postac;
        this.pozycja = pozycja;
    }

    // gettery i settery
    public int getPozycja() {
        return pozycja;
    }

    public void setPozycja(int pozycja){
        this.pozycja = pozycja;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
