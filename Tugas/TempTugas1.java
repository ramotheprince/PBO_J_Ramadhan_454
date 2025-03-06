import java.util.Scanner;

public class TempTugas1 {
    public static Scanner penginput = new Scanner(System.in);
    public static String adminU = "454";
    public static String adminP = "454";
    public static String mhsU = "japong";
    public static String mhsP = "202410370110454";

    public static void main(String[] args) {
        System.out.println("Pilihan Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("Masukkan Pilihan: ");
        
        int pilih = penginput.nextInt();
        penginput.nextLine(); 

        if (pilih == 1) {
            System.out.print("Masukkan Username: ");
            String uname = penginput.nextLine();
            System.out.print("Masukkan Password: ");
            String pass = penginput.nextLine();

            if (uname.equals(adminU) && pass.equals(adminP)) {
                System.out.println("Login Berhasil");
            } else {
                System.out.println("Login gagal: Username atau password salah");
            }
        } else if (pilih == 2) {
            System.out.print("Masukkan Username: ");
            String uname = penginput.nextLine();
            System.out.print("Masukkan Password: ");
            String pass = penginput.nextLine();

            if (uname.equals(mhsU) && pass.equals(mhsP)) {
                System.out.println("Login Berhasil");
            } else {
                System.out.println("Login gagal: Username atau password salah");
            }
        } else {
            System.out.println("Pilihan Tidak Valid");
        }

    

        penginput.close();
    }
}
