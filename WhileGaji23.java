import java.util.Scanner;

public class WhileGaji23 {
    public static void main (String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur =0.0, totalGajiLembur = 0.0;
        String jabatan;

        System.out.print("Masukkan Jumlah Karyawan: ");
        jumlahKaryawan = sc.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan Jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan Jabatan Karyawan ke-" + (i+1) + ": ");
            jabatan = sc.next();
            System.out.print("Masukkan Jumlah Jam Lembur: ");
            jumlahJamLembur = sc.nextInt();
            

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("Manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            
            i++;

            totalGajiLembur += gajiLembur; 
        }
            System.out.println("Total Gaji Lembur: " + totalGajiLembur);
    }
}