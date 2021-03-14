public class Pozoriste {

    private static int id;
    private String naziv;

    public Pozoriste (String naziv) {
        this.naziv = naziv;
        id+=1;
    }

    public String getNaziv(){
        return naziv;
    }

    public static int getId(){
        return id;
    }

    public String toString() {
        return naziv + " [" + id + "]";
    }


}
