package Personel;

public abstract class KlinikPersonel {
    protected int personelNo;
    protected String AdSoyad;
    protected String Adress;
    protected String TellNo;

    public int getpersonelNo() {
        return personelNo;
    }

    public void setpersonelNo(int no) {
        this.personelNo = no;
    }

    public String getName() {
        return AdSoyad;
    }

    public void setName(String name) {
        this.AdSoyad = name;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        this.Adress = adress;
    }

    public String getTellNo() {
        return TellNo;
    }

    public void setTellNo(String tel) {
        this.TellNo = tel;
    }
}


