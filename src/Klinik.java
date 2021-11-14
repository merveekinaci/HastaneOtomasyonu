import java.util.ArrayList;
import java.util.List;
import Hastane.Randevu;
import Personel.DisDoktoru;

public class Klinik {
    public static List<DisDoktoru> hekimListesi = new ArrayList<DisDoktoru>();
    public static List<Randevu> randevuListesi = new ArrayList<Randevu>();

    public Klinik() {
        KlinikOlustur();
    }

    public void RandevuEkle(Randevu randevu) {
        randevuListesi.add(randevu);
    }

    public int RandevuSayisi() {
        return randevuListesi.size();
    }

    public Istatistik RandevuIstatikleri() {
        Istatistik rapor = new Istatistik();
        int geldi = 0;
        int gelmedi = 0;

        for (int i = 0; i < randevuListesi.size(); i++) {
            if (randevuListesi.get(i).getRandevuGeldi() == true) {
                geldi++;
            } else {
                gelmedi++;
            }
            rapor.setGelenHasta(geldi);
            rapor.setGelmeyenHasta(gelmedi);
        }
        return rapor;
    }

    public DisDoktoru getHekim(int id) {
        for (int i = 0; i < hekimListesi.size(); i++) {
            if (id == hekimListesi.get(i).getpersonelNo()) {
                return hekimListesi.get(i);
            }
        }
        return null;
    }

    public DisDoktoru getHekim(String name) {
        for (int i = 0; i < hekimListesi.size(); i++) {
            if (name == hekimListesi.get(i).getName()) {
                return hekimListesi.get(i);
            }
        }
        return null;
    }

    public List<Randevu> getRandevuListesi(){
        return this.randevuListesi;
    }

    public void KlinikOlustur() {
        DisDoktoru hekim = new DisDoktoru(1, "Cansu Yılmaz", "Ankara", "055468245", "456984", "9-03-21");
        hekimListesi.add(hekim);
        DisDoktoru hekim2 = new DisDoktoru(2, "Ahmet Yaban", "Istanbul", "057891562", "321456", "11-10-21");
        hekimListesi.add(hekim2);
    }
}