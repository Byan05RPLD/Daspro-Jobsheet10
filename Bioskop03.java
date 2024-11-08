import java.util.Scanner;
public class Bioskop03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin" ;
        penonton[0][1] = "Bena" ;
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Mina" ;

        for (String[] baris : penonton) {
            System.out.printf("%s \t %s\n", baris[0], baris[1]);
        }

        int index = 0;
        for (String[] baris : penonton) {
            System.out.println("Panjang baris " + ": " + baris.length);
            index++;
        }
        System.out.println("Nama penonton pada baris ke-3:");
        for (String nama : penonton[2]) {
            System.out.println(nama);
        }
        System.out.println("jumlah total baris: " + penonton.length);

    }
}
