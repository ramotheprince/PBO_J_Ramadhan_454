import java.util.Scanner;

public class japongganteng{
    public static Scanner penginput = new Scanner(System.in);
    public static String adminU = "454";
    public static String adminP = "454";
    public static String mhsU = "japong";
    public static String mhsP = "202410370110454";

    public static void main(String[] args) {
        System.out.println("Pilihan Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("Masukkan Pilihan (1 atau 2): ");

        int pilih = penginput.nextInt();
        penginput.nextLine();

        if(pilih == 1){
            System.out.println("Masukkan Username: ");
            String uname = penginput.nextLine();
            System.out.println("Masukkan Password: ");
            String pass = penginput.nextLine();

            if (uname.equals(adminU) && pass.equals(adminP)) {
                System.out.println("Login Berhasil");
            } else {
                System.out.println("Login gagal: Username atau password salah");
            }
        } else if (pilih == 2) {
            System.out.println("Masukkan Username");
            String uname = penginput.nextLine();
            System.out.println("Masukkan Password: ");
            String pass = penginput.nextLine();

            if (uname.equals(mhsU) && pass.equals(mhsP)) {
                System.out.println("Login Berhasil");
            } else {
                System.out.println("Login gagal: Username atau password salah");
            }
        } else {
            System.out.println("Pilihan TIdak Valid");
        }

        penginput.close();
    }
}




        }
                }