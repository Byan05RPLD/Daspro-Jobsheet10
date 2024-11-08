import java.util.Scanner;
public class BioskopWithScanner03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama;
        
        while (true) {
            
        
        System.out.println("Menu:");
        System.out.println("1. input data penonton");
        System.out.println("2. Tampilan daftar penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih menu (1-3): ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();

                int baris, kolom;
                while (true) {
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Baris atau kolom tidak valid Silahkan coba lagi.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan");
                        break;
                    }
                }
                break;

            case 2:
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                    String penontonNama = (penonton[i][j] != null) ? penonton[i][j] : "Kosong";
                    System.out.println("Baris" + (i + 1) + ", kolom " + (j + i) + ": " + penontonNama);
                }
                }
                break;

                case 3:
                System.out.println("Terima kasih! keluar dari program.");
                sc.close();
                return;

                default:
                System.out.println("Pilihan tidak valid.Silahkan coba lagi");
            }
        }
    }
}
