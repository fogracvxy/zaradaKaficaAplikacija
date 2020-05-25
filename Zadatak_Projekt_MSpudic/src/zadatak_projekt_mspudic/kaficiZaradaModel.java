package zadatak_projekt_mspudic;

/**
 *
 * @author MSpudic
 */
public class kaficiZaradaModel {
    private String nazivKafica;
    private int mjesec;
    private float mjesecnaZarada;

    public kaficiZaradaModel(String nazivKafica, int mjesec, float mjesecnaZarada) {
        this.nazivKafica = nazivKafica;
        this.mjesec = mjesec;
        this.mjesecnaZarada = mjesecnaZarada;
    }
    
    public String getNazivKafica() {
        return nazivKafica;
    }

    public void setNazivKafica(String NazivKafica) {
        this.nazivKafica = NazivKafica;
    }

    public int getMjesec() {
        return mjesec;
    }

    public void setMjesec(int mjesec) {
        this.mjesec = mjesec;
    }

    public float getMjesecnaZarada() {
        return mjesecnaZarada;
    }

    public void setMjesecnaZarada(float mjesecnaZarada) {
        this.mjesecnaZarada = mjesecnaZarada;
    }

    
}
