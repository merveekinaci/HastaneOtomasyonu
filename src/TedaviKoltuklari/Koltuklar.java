package TedaviKoltuklari;

public abstract class Koltuklar {

    protected int KoltukId;

    protected Boolean TedaviDurumu = false;

    public void GenelMuaneYap() {
        TedaviDurumu = true;
    }

    public void TedaviBitir() {
        TedaviDurumu = false;
    }

    public abstract String getUretici();

    public abstract String getUretimNo();

    public abstract Boolean KoltukBos();

    public int getKoltukId() {

        return this.KoltukId;
    }
}
