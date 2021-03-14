public class Reditelj extends Zaposleni{

    private String nadimak;

    public Reditelj(String ime, Pozoriste pozoriste, String nadimak) {
        super(ime, pozoriste);
        this.nadimak = nadimak;
    }

    public String getNadimak() {
        return nadimak;
    }

    public String toString() {
        return nadimak + "_" + super.getIme() + " [" + super.getPozoriste() + "]";
    }
}
