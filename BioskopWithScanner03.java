import java.util.Scanner;
public class BioskopWithScanner03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. input data penonton");
        System.out.println("2. Tampilan daftar penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih menu (1-3): ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih untuk input data penonton");
                break;
            case 2:
                System.out.println("Anda memilh untuk menampilkan daftar penonton");
                break;
            case 3:
                System.out.println("Terima Kasih! keluar dari program");
                sc.close();
                return;
            default:
                System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
        }
    }
}