package proje.proje_2;

import java.util.ArrayList;

public class Bilgisayar extends Oyuncu{

    public Bilgisayar() {
        
    }


    public String skorGoster(int oyuncuSkor, int bilgisayarSkor) {
        return super.skorGoster(oyuncuSkor, bilgisayarSkor);
    }

    @Override
    public void kartSec() {
        super.kartSec(); 
    }
    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }

}
