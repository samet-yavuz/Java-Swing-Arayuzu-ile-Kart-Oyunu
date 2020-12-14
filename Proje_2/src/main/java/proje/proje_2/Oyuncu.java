package proje.proje_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Oyuncu {
    int oyuncuID;
    String oyuncuAdi;
    int Skor;
    
Futbolcu[] FkartListesi=new Futbolcu[8];
Basketbolcu[] BkartListesi=new Basketbolcu[8];
    
    public void kartıAl(Futbolcu[] fdizi,Basketbolcu[] bdizi){
    FkartListesi=fdizi;
    BkartListesi=bdizi;
        
    }
    String skorCumle;
    
    public String skorGoster(int oyuncuSkor,int bilgisayarSkor){
        if(oyuncuSkor>bilgisayarSkor){
            skorCumle="Puanınız:"+oyuncuSkor+"\nBilgisayarın Puanı:"+bilgisayarSkor+"\nSiz kazandınız.";
            return skorCumle;
        }
        else if(oyuncuSkor==bilgisayarSkor){
            skorCumle="Puanınız:"+oyuncuSkor+"\nBilgisayarın Puanı:"+bilgisayarSkor+"\nBerabere";
            return skorCumle;
        }
        else{
            skorCumle="Puanınız:"+oyuncuSkor+"\nBilgisayarın Puanı:"+bilgisayarSkor+"\nBilgisayar Kazandı";
            return skorCumle;
        }  
    }
    
    public int[] sayilariKaristir(){
        int temp;
        int[] dizi = new int[8];
        dizi[0] = 0;
        for (int i = 0; i < 8; i++) {
            temp = (int) (Math.random() * 8);
            for (int j = 0; j <= i; j++) {
                if (dizi[j] == temp) {
                    temp = (int) (Math.random() * 8);
                    j = 0;
                }
            }
            dizi[i] = temp;
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    dizi[j] = 0;
                }
            }
        }
        return dizi;
    }
    public int[] sayilariKaristir2(){
        int temp;
        int[] dizi = new int[4];
        dizi[0] = 0;
        for (int i = 0; i < 4; i++) {
            temp = (int) (Math.random() * 4);
            for (int j = 0; j <= i; j++) {
                if (dizi[j] == temp) {
                    temp = (int) (Math.random() * 4);
                    j = 0;
                }
            }
            dizi[i] = temp;
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    dizi[j] = 0;
                }
            }
        }
        return dizi;
    }
    public void kartSec(){
    
    }

//getter ve setter'lar
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

    public Futbolcu[] getFkartListesi() {
        return FkartListesi;
    }

    public void setFkartListesi(Futbolcu[] FkartListesi) {
        this.FkartListesi = FkartListesi;
    }

    public Basketbolcu[] getBkartListesi() {
        return BkartListesi;
    }

    public void setBkartListesi(Basketbolcu[] BkartListesi) {
        this.BkartListesi = BkartListesi;
    }


}