import java.util.ArrayList;
import java.util.List;

public class Abonnent implements Subscription{
    private String name;
    private Zeitschrift zeitschrift;
    private double geldsumme;

    public Abonnent(String name, Zeitschrift zeitschrift, double geldsumme) {
        this.name = name;
        this.zeitschrift = zeitschrift;
        this.geldsumme = geldsumme;
    }

    @Override
    public boolean pay(Object value){
        if(this.geldsumme-(Double)value<0){
            return false;
        }else {
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zeitschrift getZeitschrift() {
        return zeitschrift;
    }

    public void setZeitschrift(Zeitschrift zeitschrift) {
        this.zeitschrift = zeitschrift;
    }

    public double getGeldsumme() {
        return geldsumme;
    }

    public void setGeldsumme(double geldsumme) {
        this.geldsumme = geldsumme;
    }
}
