package proje.proje_2;

public class Basketbolcu extends Sporcu{

   private int ikilik;
   private int ucluk;
   private int serbestAtis;
   private boolean kartKullanildiMi;
   private String basketbolcuAdi;
   private String basketbolcuTakim;

    public Basketbolcu(int ikilik, int ucluk, int serbestAtis, String sporcuIsim, String sporcuTakım, String sporcuKartYolu, boolean kartKullanildiMi) {
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
        this.basketbolcuAdi = sporcuIsim;
        this.basketbolcuTakim = sporcuTakım;
        this.sporcuKartYolu = sporcuKartYolu;
        this.kartKullanildiMi = kartKullanildiMi;
    }
    
    public Basketbolcu() {
    }
    
    public Basketbolcu(String sporcuIsim, String sporcuTakım,String sporcuKartYolu) {
        super(sporcuIsim, sporcuTakım, sporcuKartYolu);
    }

    @Override
    public void sporcuPuaniGoster() {
        super.sporcuPuaniGoster();
    }

    public String getBasketbolcuAdi() {
        return basketbolcuAdi;
    }

    public void setBasketbolcuAdi(String basketbolcuAdi) {
        this.basketbolcuAdi = basketbolcuAdi;
    }

    public String getBasketbolcuTakim() {
        return basketbolcuTakim;
    }

    public void setBasketbolcuTakim(String basketbolcuTakim) {
        this.basketbolcuTakim = basketbolcuTakim;
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

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }
    
    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }
    
    
}
