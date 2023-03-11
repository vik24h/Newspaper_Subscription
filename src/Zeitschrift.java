import java.util.ArrayList;
import java.util.List;

public class Zeitschrift {
    private String name;
    private double preis;
    private List<Abonnent> liste;

    public Zeitschrift(String name) {
        this.name = name;
        this.preis = 0;
        this.liste = new ArrayList<>();
    }

    public void addAbonnent(Abonnent abnt){
        this.liste.add(abnt);
    }

    public void removeAbonnent(Abonnent abnt){
        this.liste.remove(abnt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
        List<Abonnent> to_delete=new ArrayList<>();
        for(Abonnent abnt:this.liste) {
            if(abnt.pay(this.preis)==false){
                to_delete.add(abnt);
            }else{
                abnt.setGeldsumme((abnt.getGeldsumme()-preis));
            }
        }
        for(Abonnent abnt:to_delete){
            removeAbonnent(abnt);
        }
    }

    public List<Abonnent> getListe() {
        return liste;
    }

    public void setListe(List<Abonnent> liste) {
        this.liste = liste;
    }
}
