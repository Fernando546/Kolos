public class Student{
    private String imie;
    private String nazwisko;
    private int numer_indexu;
    private String grupa_dziekanska;
    private boolean szkolenie_bhp;

    public Student(String imie, String nazwisko, int numer_indexu, String grupa_dziekanska, boolean szkolenie_bhp){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_indexu = numer_indexu;
        this.grupa_dziekanska = grupa_dziekanska;
        this.szkolenie_bhp = szkolenie_bhp;
    }

    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public int getNumer_indexu() {
        return numer_indexu;
    }
    public void setNumer_indexu(int numer_indexu) {
        this.numer_indexu = numer_indexu;
    }
    public String getGrupa_dziekanska() {
        return grupa_dziekanska;
    }
    public void setGrupa_dziekanska(String grupa_dziekanska) {
        this.grupa_dziekanska = grupa_dziekanska;
    }
    public boolean getSzkolenie_bhp() {
        return szkolenie_bhp;
    }
    public void setSzkolenie_bhp(boolean szkolenie_bhp) {
        this.szkolenie_bhp = szkolenie_bhp;
    }
    public void BHP(){
        if (!szkolenie_bhp){
            System.out.println("Smiec nie zrobil BHP");
        }
    }
}
