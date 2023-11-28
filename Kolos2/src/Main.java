import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ram = new Random();
        int tab[] = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = ram.nextInt(73) + 17;
        }
        int bat[] = tab.clone();
        for (int i = 0; i < bat.length; i++) {
            System.out.println(bat[i]);
        }
    }
}

//typ[] nazwa_tablicy = new typ[liczba_elementów];
//typ nazwa_tablicy[] = new typ[liczba_elementów];
