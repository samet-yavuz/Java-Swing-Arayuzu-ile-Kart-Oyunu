package proje.proje_2;

public class Sporcu {
    String sporcuIsim;
    String sporcuTakım;
    String sporcuKartYolu;
//Parametreli ve parametresiz Constructor'lar tanımlandı.
    public Sporcu(String sporcuIsim, String sporcuTakım,String sporcuKartYolu) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakım = sporcuTakım;
        this.sporcuKartYolu = sporcuKartYolu;
    }

    public Sporcu() {
        
    }
    
    public void sporcuPuaniGoster(){
        
    }
//getter ve setter'lar
    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakım() {
        return sporcuTakım;
    }

    public void setSporcuTakım(String sporcuTakım) {
        this.sporcuTakım = sporcuTakım;
    }

    public String getSporcuKartYolu() {
        return sporcuKartYolu;
    }

    public void setSporcuKartYolu(String sporcuKartYolu) {
        this.sporcuKartYolu = sporcuKartYolu;
    }

}