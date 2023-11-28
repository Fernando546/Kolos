public class Student{
    String imie;
    String nazwisko;
    int numer_indexu;
    String grupa_dziekanska;
    boolean szkolenie_bhp;

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
        if (getSzkolenie_bhp() == false){
            System.out.println("Smiec nie zrobil BHP");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowal", 123456, "1ID22A", false);
        Student student2 = new Student("Janusz", "Kowalski", 123456, "1ID22A", false);
        Student student3 = new Student("Januszeks", "Kowalsky", 123456, "1ID22A", false);

        GrupaAkademicka grupa = new GrupaAkademicka();
        grupa.setStudent(student1);
        grupa.setStudent(student2);
        grupa.setStudent(student3);
        grupa.wypisz();
    }
}
