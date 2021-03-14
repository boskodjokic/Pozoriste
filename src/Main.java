public class Main {
    public static void main(String[] args) {
Pozoriste pozoriste = new Pozoriste("Pozoristance Puz");
Pozoriste pozoriste1 = new Pozoriste("Bosko Buha");

Glumac glumac = new Glumac("Frfljo Frfljic", pozoriste1, "frfljasti frfljac");
Glumac glumac1 = new Glumac("Mis Parcov", pozoriste1, "Macka");
Glumac glumac2 = new Glumac("Mjau Mjau", pozoriste1, "Ulicna svetiljka");


Glumac glumac3 = new Glumac("Logi Tech", pozoriste, "Slusalice");
Glumac glumac4 = new Glumac("Forma Ideale", pozoriste, "radni sto");
Glumac glumac5 = new Glumac("Ven Tilator", pozoriste, "Ventilator");

Reditelj reditelj = new Reditelj("Hama Mis", pozoriste1, "Dzontra");
Reditelj reditelj1 = new Reditelj("Sam Sung", pozoriste, "Koreanac");

Predstava predstava = new Predstava("Ko li mi te nadje", pozoriste);

predstava.dodajZaposlenog(glumac);
predstava.dodajZaposlenog(glumac3);
predstava.dodajZaposlenog(glumac4);
predstava.dodajZaposlenog(reditelj);
predstava.dodajZaposlenog(reditelj1);
predstava.dodajZaposlenog(glumac5);

System.out.println(predstava.toString());

    }
}
