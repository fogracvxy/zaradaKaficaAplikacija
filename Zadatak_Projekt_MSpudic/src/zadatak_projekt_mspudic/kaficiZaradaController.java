package zadatak_projekt_mspudic;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Spuda
 */
public class kaficiZaradaController {
    
     private List<kaficiZaradaModel> listaKafica = new ArrayList<kaficiZaradaModel>();
    
    public void unesiMjesecnuZaradu(String nazivKafica, int mjesec, float mjesecnaZarada)
    {
        listaKafica.add(new kaficiZaradaModel(nazivKafica,mjesec,mjesecnaZarada));
    }
    //ispis zarade za odredeni kafic
    public String ispisZaradeZaKafic(String nazivKafica)
    {
        String stringcin = new String();
            for (int i = 0; i < listaKafica.size(); i++)
            {
                kaficiZaradaModel z = listaKafica.get(i);
                if (z.getNazivKafica().equals(nazivKafica))
                {
                    stringcin += "" + (i+1) + ". " + "Kafic:" + " " + z.getNazivKafica() + " " + "Mjesec:" + " " +  z.getMjesec() + "." +" " + "Zarada:" + " " +z.getMjesecnaZarada() + " kn" + "\n";
                }
            }
        
        return stringcin;
    }
    // ispis zarada za odredeni mjesec
    public String ispisZaradeZaMjesec(int mjesec)
    {
        String stringcin = new String();
            for (int i = 0; i < listaKafica.size(); i++)
            {
                 kaficiZaradaModel z = listaKafica.get(i);
                if (z.getMjesec() == mjesec)
                {
                    stringcin += "" + (i+1) + ". " +"Kafic:" + " " + z.getNazivKafica() + " " + "Zarada:" + " " + z.getMjesecnaZarada() + " kn"+ "\n";
                }
            }
        
        return stringcin;
    }
    // ispis svih zarada svih kafica
    public String ispisSvihZarada()
    {
            String stringcin = new String();
            for (int i = 0; i < listaKafica.size(); i++)
            {
                 kaficiZaradaModel z = listaKafica.get(i);
                stringcin +="" + (i+1) + ". " + "Kafic:" + " " + z.getNazivKafica() + " " + "Mjesec:" + " " +  z.getMjesec() + "." +  " " + "Zarada:" + " " + z.getMjesecnaZarada() + " kn"+ "\n";
                
            }
       return stringcin;
    }
    // ispis prosjecne zarade za odredeni kafic
    public String ispisProsjecneZaradeZaOdredeniKafic(String nazivKafica) {
		float zaradaprosjecno = 0;
		String ispis = "";
		int counter = 0;
		for (int i = 0; i < listaKafica.size(); i++) {
			 kaficiZaradaModel z = listaKafica.get(i);
			 if (z.getNazivKafica().equals(nazivKafica)) {
				 counter++;
				 zaradaprosjecno += (z.getMjesecnaZarada());
			 }
			 
		}
		zaradaprosjecno /= counter;
		ispis += ""  + "Prosjecna zarada kafica" + " " + nazivKafica + " za "+ counter +  " mjeseca je:" + " " + zaradaprosjecno + " kn" + "\n";
		return ispis;
	}
    public void  brisiZadnjiUnos() {
    	// provjera da lista nije prazna zbog prevencije exceptiona  "ArrayIndexOutOfBoundsException" 
    		if (listaKafica.size() != 0) {
    			// brisanje zadnjeg unosa
    			listaKafica.remove(listaKafica.size()-1);
    		}
    	}
    }
