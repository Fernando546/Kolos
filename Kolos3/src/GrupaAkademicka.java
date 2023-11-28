import java.util.*;

public class GrupaAkademicka {
    private List<Student> listaStudentow = new ArrayList<>();
    public void setStudent(Student student){
        listaStudentow.add(student);
    }
    public void wypisz(){
        for (Student student : listaStudentow){
            System.out.println(student.getImie() + " " + student.getNazwisko() + " " + student.getNumer_indexu() + " " + student.getGrupa_dziekanska() + " " + student.getSzkolenie_bhp());
            student.BHP();
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
