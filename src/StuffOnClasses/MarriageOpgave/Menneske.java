package StuffOnClasses.MarriageOpgave;

public class Menneske {

    private String navn;
    private Menneske aegtefaelle;

    public Menneske(String navn){
        this.navn = navn;
    }


    public Menneske getAegtefaelle(){
        return aegtefaelle;
    }
    public void setAegtefaelle(Menneske aegtefaelle){
        this.aegtefaelle = aegtefaelle;
    }

    public String getNavn(){
        return navn;
    }


    public void gifterSigMed(Menneske partner){
        if (!(partner.equals(this))){
            aegtefaelle = partner;
            partner.setAegtefaelle(this);
        }

    }

    public void bliverSkilt(){
        aegtefaelle.setAegtefaelle(null);
        aegtefaelle = null;
    }

    @Override
    public String toString(){
        String seg1 = navn + " er gift med ";
        String seg2;
        if (aegtefaelle == null){
            seg2 = "ingen";
        }else{
            seg2 = aegtefaelle.getNavn();
        }
        return seg1 + seg2;
    }
}
