import java.util.ArrayList;

public class Predstava {

    private String naziv;
    private Pozoriste pozoriste;
    private ArrayList<Zaposleni> zaposleni;

    public Predstava (String naziv, Pozoriste pozoriste) {
        this.naziv = naziv;
        this.pozoriste = pozoriste;
        this.zaposleni = new ArrayList<Zaposleni>();
    }

    public String getNaziv() {
        return naziv;
    }
    public ArrayList<Zaposleni> getZaposleni() {
        return zaposleni;
    }

    public Pozoriste getPozoriste() {
        return pozoriste;
    }

    public int getBrojZaposlenih() {
        return zaposleni.size();
    }
    public void dodajZaposlenog(Zaposleni zaposleni) {
        if (zaposleni.getPozoriste().equals(this.getPozoriste())) {
            this.zaposleni.add(zaposleni);
        } else {
            System.out.println("Zaposleni " + zaposleni.getIme() + " nije zaposlen u istom pozoristu.");
        }
        }

    public void ukloniZaposlenog (Zaposleni zaposleni) {
        this.zaposleni.remove(zaposleni);
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append(", ").append(pozoriste).append("\n");
        sb.append("Zaposleni:\n");
        for (int i = 0; i < zaposleni.size(); i++) {
            sb.append(zaposleni.get(i).toString()).append("\n");
        }
        return sb.toString();
     }
}
