package TedaviKoltuklari;

public class XFirmaKoltugu extends Koltuklar implements KanalTedavisi {
    private final String URETICI = "X Firması Şirketi";
    private final String URETIM_NO = "X4561256";

    public XFirmaKoltugu() {

        this.KoltukId = 1;
    }

    public String getUretici() {

        return this.URETICI;
    }

    public String getUretimNo() {
        return this.URETIM_NO;
    }

    @Override
    public void KanalTedavi() {
        TedaviDurumu = true;
    }

    @Override
    public Boolean KoltukBos() {
        return TedaviDurumu;
    }
}