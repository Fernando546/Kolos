import java.util.Scanner;

public class Main {
    public static void main(String[] sexxxy) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int wiek = sc.nextInt();
        if (wiek < 18) {
            System.out.println("Nie jestes pelnoletni!");
        } else {
            System.out.println("Ile lat jezdzisz bez stłuczki?");
            int jbs = sc.nextInt();
            if (jbs < 1){
                System.out.println("Nie przysluguje cie znizka!");
            }
            if (jbs >= 1 && jbs < 2 ){
                System.out.println("Przysluguje ci znizka 10%");
            }
            if (jbs >= 2 && jbs < 3 ){
                System.out.println("Przysluguje ci znizka 15%");
            }
            if (jbs >= 3 && jbs < 4 ){
                System.out.println("Przysluguje ci znizka 17%");
            }
            if (jbs >= 4 && jbs < 5 ){
                System.out.println("Przysluguje ci znizka 22%");
            }
            if (jbs >= 5) {
                System.out.println("Przysluguje ci znizka 30%");
            }
        }
    }
}