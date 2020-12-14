package proje.proje_2;



public class Test {        
    
    public static void main(String[] args) {
        
    Futbolcu fRonaldo =new Futbolcu(95,95,95,"Cristiano Ronaldo","Juventus","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\fronaldo.jpg",false);
    Futbolcu fMessi = new Futbolcu(90,90,95,"Lionel Messi","Barcelona","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\fmessi.jpg",false);
    Futbolcu fNeymar = new Futbolcu(80,85,90,"Neymar Jr.","Paris Saint Germain","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\fneymar.jpg",false);
    Futbolcu fLewandowski = new Futbolcu(90,70,95,"Robert Lewandowski","Bayern München","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\flewandowski.jpg",false);
    Futbolcu fUnder = new Futbolcu(85,95,85,"Cengiz Under","Leicester City","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\fUnder.jpg",false);
    Futbolcu fAlex = new Futbolcu(90,70,75,"Alex de Souza","Fenerbahçe","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\falex.jpg",false);
    Futbolcu fHagi = new Futbolcu(75,75,80,"Gheorghe Hagi","Galatasaray","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\fhagi.jpg",false);
    Futbolcu fSalah = new Futbolcu(75,70,90,"Mohamed Salah","Liverpool","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\fsalah.jpg",false);
//------------------------------------------------------
    Basketbolcu bJordan =new Basketbolcu(100,95,100,"Michael Jordan","Chicago Bulls","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\bjordan.jpg",false);
    Basketbolcu bCurry =new Basketbolcu(100,90,75,"Stephan Curry","Golden State Warriors","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\bcurry.jpg",false);
    Basketbolcu bLebron =new Basketbolcu(90,95,90,"Lebron James","Los Angeles Lakers","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\blebron.jpg",false);
    Basketbolcu bCedi =new Basketbolcu(60,65,65,"Cedi Osman","Cleveland","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\bcedi.jpg",false);
    Basketbolcu bLarkin =new Basketbolcu(70,70,70,"Shane Larkin","Anadolu Efes","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\blarkin.jpg",false);
    Basketbolcu bVesely =new Basketbolcu(10,70,50,"Jan Vesely","FB Beko","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\bvesely.jpg",false);
    Basketbolcu bSloukas =new Basketbolcu(65,75,100,"Kostas Sloukas","Olympiakos","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\bsloukas.jpg",false);
    Basketbolcu bTurkoglu =new Basketbolcu(90,70,70,"Hidayet Turkoglu","Los Angeles Creepers","C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje_2\\src\\main\\java\\proje\\proje_2\\photos\\bturkoglu.jpg",false); 
    
            
Futbolcu[] FkartListesi=new Futbolcu[8];
Basketbolcu[] BkartListesi=new Basketbolcu[8];
    
    Oyuncu oyuncu =new Oyuncu();
    GameScreen gamescreen =new GameScreen();
    
    FkartListesi[0]=fRonaldo;
    FkartListesi[1]=fMessi;
    FkartListesi[2]=fNeymar;
    FkartListesi[3]=fLewandowski;
    FkartListesi[4]=fUnder;
    FkartListesi[5]=fAlex;
    FkartListesi[6]=fHagi;
    FkartListesi[7]=fSalah;
    BkartListesi[0]=bJordan;
    BkartListesi[1]=bCurry;
    BkartListesi[2]=bLebron;
    BkartListesi[3]=bCedi;
    BkartListesi[4]=bLarkin;
    BkartListesi[5]=bVesely;
    BkartListesi[6]=bSloukas;
    BkartListesi[7]=bTurkoglu;
   

     
    oyuncu.kartıAl(FkartListesi, BkartListesi);


    
    gamescreen.kartıAl(FkartListesi, BkartListesi);
    gamescreen.futbolAttır(oyuncu.sayilariKaristir());
    gamescreen.basketbolAttır(oyuncu.sayilariKaristir());
    gamescreen.labelAttır(oyuncu.sayilariKaristir2());
    gamescreen.kartlarıDagıt();
    gamescreen.setVisible(true);

}
}
