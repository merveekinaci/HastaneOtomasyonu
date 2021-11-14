import java.text.ParseException;
import java.util.Date;
import Hastane.Hasta;
import Hastane.Randevu;
import Hastane.TimeFormat;

public class Main {

    private static Klinik k = new Klinik();

    public static void main(String[] args)  throws ParseException {
        RandevuKontrol();
    }

    public static void HaftaBitimi() {
        Istatistik rapor = k.RandevuIstatikleri();
    }

    public static void RandevuKontrol() throws ParseException {
        String randevuTarihi = "4-05-21 13.00";
        Date date = TimeFormat.LongTimeFormat().parse(randevuTarihi);
        Hasta hasta = new Hasta("Can Akman", "Yükselen" , "05456987");
        Randevu randevu = new Randevu(k.getHekim(1), hasta,  date);
        k.RandevuEkle(randevu);


        String baskarandevu = "15-10-21 09.50";
        Date date1 = TimeFormat.LongTimeFormat().parse(baskarandevu);
        Hasta hasta1 = new Hasta("Nihal Korkmaz", "Çaldıran" , "056544569");
        Randevu randevu1 = new Randevu(k.getHekim(2), hasta1,  date1);
        k.RandevuEkle(randevu1);


    }

}

