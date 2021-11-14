package Hastane;

public class Hasta {
    private int hastaId;
    private String hastaName;
    private String hastaAdress;
    private String hastaTelefon;
    private static int Hastano =123456789;

    public Hasta(String name, String adres, String telNo) {
        this.hastaName = name;
        this.hastaAdress = adres;
        this.hastaTelefon = telNo;
        HastaIdOlustur();
    }

    public String getHastaName() {
        return this.hastaName;
    }
    public String getHastaAdress() {
        return this.hastaAdress;
    }
    public String getHastaTel() {
        return this.hastaTelefon;
    }
    public int getHastaID() {
        return this.hastaId;
    }
    private void HastaIdOlustur() {
        this.hastaId = Hastano;
        Hastano++;
    }
}
