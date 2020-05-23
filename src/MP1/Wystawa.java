package MP1;

import java.util.Set;

public class Wystawa extends ObjectPlus{

    private String motywPrzewodni;
    private String komentarz;

    Wystawa(String motywPrzewodni,
                    String komentarz,
                    Set<Ksiazka> zestawKsiazek){
        super();
        if ( motywPrzewodni == null ){throw new NullPointerException();}
        this.motywPrzewodni = motywPrzewodni;
        if ( komentarz == null ){throw new NullPointerException();}
        this.komentarz = komentarz;
    }

    public String getMotywPrzewodni() {
        return motywPrzewodni;
    }

    public void setMotywPrzewodni(String motywPrzewodni) {
        if ( motywPrzewodni == null ){throw new NullPointerException();}
        this.motywPrzewodni = motywPrzewodni;
    }

    public String getKomentarz() {
        return komentarz;
    }

    public void setKomentarz(String komentarz) {
        if ( komentarz == null ){throw new NullPointerException();}
        this.komentarz = komentarz;
    }
}
