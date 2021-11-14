package Hastane;

import java.util.Date;
import Personel.DisDoktoru;
import TedaviKoltuklari.Koltuklar;

public class Randevu {
    private DisDoktoru hekim;
    private Hasta hasta;
    private Date randevuTarihi;
    private boolean randevuGeldimi;
    private Koltuklar koltuk;

    public Randevu(DisDoktoru hekim, Hasta hasta, Date tarih) {
        this.hekim = hekim;
        this.hasta = hasta;
        this.randevuTarihi = tarih;

    }
    public void setRandevuGeldi(boolean durum) {
        this.randevuGeldimi = durum;
    }

    public boolean getRandevuGeldi() {
        return this.randevuGeldimi;
    }
    public DisDoktoru getHekim() {
        return this.hekim;
    }
    public Hasta getHasta() {
        return this.hasta;
    }
    public Date getTarih() {
        return this.randevuTarihi;
    }
    public int getKoltuk() {
        return this.koltuk.getKoltukId();
    }

}

