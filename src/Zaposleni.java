public class Zaposleni {

    private String ime;
    private Pozoriste pozoriste;

    public Zaposleni (String ime, Pozoriste pozoriste){
        this.ime = ime;
        this.pozoriste = pozoriste;
    }

    public String getIme () {
        return ime;
    }

    public Pozoriste getPozoriste() {
        return pozoriste;
    }
    public String toString() {
        return  ime + " [" + pozoriste.toString() + "]";
    }
}
