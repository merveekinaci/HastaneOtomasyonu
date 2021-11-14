package TedaviKoltuklari;

public class YFirmaKoltugu extends Koltuklar implements DisTedavisi {
    private final String URETICI = "Y Firması Şirketi";
    private final String URETIM_NO = "Y2456320";

    public YFirmaKoltugu() {
        this.KoltukId = 2;
    }

    @Override
    public String getUretici() {
        return URETICI;
    }
    @Override
    public String getUretimNo() {
        return URETIM_NO;
    }
    @Override
    public Boolean KoltukBos() {
        return TedaviDurumu;
    }
    @Override
    public void Dolgu() {
        TedaviDurumu = true;
    }
    @Override
    public void DisCekimi() {
        TedaviDurumu = true;
    }
}