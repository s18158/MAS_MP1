package MP1;

import java.util.Set;

public class Seria extends ObjectPlusPlus{

    private String tytulSerii;
    private Set<Ksiazka> zestawKsiazek;

    Seria(String tytulSerii,
                  Set<Ksiazka> zestawKsiazek){
        super();
        if ( tytulSerii == null ){throw new NullPointerException();}
        this.tytulSerii = tytulSerii;
        if ( zestawKsiazek == null ){throw new NullPointerException();}
        this.zestawKsiazek = zestawKsiazek;
    }

    int getSeriesSize(){
        return zestawKsiazek.size();
    }

    public String getTytulSerii() {
        return tytulSerii;
    }

    public void setTytulSerii(String tytulSerii) {
        if ( tytulSerii == null ){throw new NullPointerException();}
        this.tytulSerii = tytulSerii;
    }

    public Set<Ksiazka> getZestawKsiazek() {
        return zestawKsiazek;
    }

    public void setZestawKsiazek(Set<Ksiazka> zestawKsiazek) {
        if ( zestawKsiazek == null ){throw new NullPointerException();}
        this.zestawKsiazek = zestawKsiazek;
    }
}
