import java.util.*;

public class GrupaAkademicka {
    ArrayList<Student> lista_studentow = new ArrayList<Student>();
    public void setStudent(Student student){
        lista_studentow.add(student);
    }
    public void wypisz(){
        for (Student student : lista_studentow){
            System.out.println(student.getImie() + " " + student.getNazwisko() + " " + student.getNumer_indexu() + " " + student.getGrupa_dziekanska() + " " + student.getSzkolenie_bhp());
            student.BHP();
        }
    }
}
