package proje.proje_2;

import java.awt.Image;

public class Futbolcu extends Sporcu{
   private int penalti;
   private int setbestVurus;
   private int kaleciKarsiKarsiya;
   private boolean kartKullanildiMi;
   private String futbolcuAdi;
   private String futbolcuTakim;

   
//Parametreli ve parametresiz Constructor'lar tanımlandı.
    public Futbolcu(int penalti, int setbestVurus, int kaleciKarsiKarsiya, String sporcuIsim, String sporcuTakım, String sporcuKartYolu, boolean kartKullanildiMi) {
        this.penalti = penalti;
        this.setbestVurus = setbestVurus;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
        this.futbolcuAdi = sporcuIsim;
        this.futbolcuTakim = sporcuTakım;
        this.sporcuKartYolu = sporcuKartYolu;
        this.kartKullanildiMi = kartKullanildiMi;
    }

    public Futbolcu() {
    }
    
    public Futbolcu(String sporcuIsim, String sporcuTakım,String sporcuKartYolu) {
        super(sporcuIsim, sporcuTakım, sporcuKartYolu);
    }

    @Override
    public void sporcuPuaniGoster() {
        super.sporcuPuaniGoster();
        System.out.println(this.penalti+" ");
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    public String getFutbolcuAdi() {
        return futbolcuAdi;
    }

    public void setFutbolcuAdi(String futbolcuAdi) {
        this.futbolcuAdi = futbolcuAdi;
    }

    public String getFutbolcuTakim() {
        return futbolcuTakim;
    }

    public void setFutbolcuTakim(String futbolcuTakim) {
        this.futbolcuTakim = futbolcuTakim;
    }

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getSetbestVurus() {
        return setbestVurus;
    }

    public void setSetbestVurus(int setbestVurus) {
        this.setbestVurus = setbestVurus;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

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
