import java.util.Scanner;

public class DoWhileCuti23 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah Anda Ingin Mengambil Cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah Hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa Jata Cuti Anda Tidak Mencukupi");
                    break;
                }
            }
        }while (jatahCuti > 0);
    }
}
