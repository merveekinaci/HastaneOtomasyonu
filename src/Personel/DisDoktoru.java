package Personel;
import java.util.List;
import Hastane.Randevu;
import TedaviKoltuklari.XFirmaKoltugu;

public class DisDoktoru extends KlinikPersonel{
    private String kayitNo;
    private String kayitTarihi;

    private void setKayitNo(String kayitNo) {
        this.kayitNo = kayitNo;
    }

    public String getKayitNo() {
        return this.kayitNo;
    }

    private void setKayitTarihi(String tarih) {
        this.kayitTarihi = tarih;
    }

    public String getKayitTarihi() {
        return this.kayitTarihi;
    }
    public DisDoktoru(int no, String name,String adress, String tel,String KayitNo,String KayitTarihi) {
        this.setpersonelNo(no);
        this.setName(name);
        this.setAdress(adress);
        this.setTellNo(tel);
        this.setKayitNo(KayitNo);
        this.setKayitTarihi(KayitTarihi);
    }
    public void HekimMuanesi(List<Randevu> r) {

        XFirmaKoltugu koltuk = new XFirmaKoltugu();
        koltuk.KanalTedavi();

        for(int i = 0; i < r.size() ; i++) {
            if(r.get(i).getHekim().getKayitNo() == this.getKayitNo()) {
                RandevuDurumuGuncelle(r.get(i), true);
            }
        }
    }

    private void RandevuDurumuGuncelle(Randevu r, boolean durum) {
        r.setRandevuGeldi(durum);


    }

    }

