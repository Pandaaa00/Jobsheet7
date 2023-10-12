import java.util.Scanner;

public class BookingRuangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Variabel untuk menyimpan informasi ruangan
            String namaRuangan;
            int kapasitasRuangan;
            double hargaPerJam = 30000;

            // Meminta pengguna untuk mengisi informasi ruangan
            System.out.print("Masukkan nama ruangan: ");
            namaRuangan = input.nextLine();

            System.out.print("Masukkan kapasitas ruangan: ");
            kapasitasRuangan = input.nextInt();

            System.out.print("Masukkan jumlah jam yang ingin dipesan: ");
            double jumlahJam = input.nextDouble();

            System.out.print("Masukkan tanggal pemesanan: ");
            int tanggal = input.nextInt();

            System.out.print("Masukkan bulan pemesanan: ");
            int bulan = input.nextInt();

            System.out.print("Masukkan tahun pemesanan: ");
            int tahun = input.nextInt();

            String jenisBulan = (bulan % 2 == 0) ? "januari-april" : "mei-desember";
            System.out.println("Bulan " + bulan + ".");
            
        
            double totalHarga = hargaPerJam * jumlahJam;

        
            if (jenisBulan.equals("januari-april")) {
                double diskon = 0.05; // diskon menjadi 5%
                double jumlahDiskon = totalHarga * diskon;
                totalHarga -= jumlahDiskon;  
            } else if (kapasitasRuangan > 50 && kapasitasRuangan <= 100) {
                double tambahanBiaya = totalHarga * 0.05; // 5% tambahan biaya
                totalHarga += tambahanBiaya;
            } else if (kapasitasRuangan > 100) {
                double tambahanBiaya = totalHarga * 0.10; // 10% tambahan biaya
                totalHarga += tambahanBiaya;
            }

            // Menampilkan output
            System.out.println("\nBooking Ruangan: " + tanggal + "/" + bulan + "/" + tahun);
            System.out.println("Nama Ruangan: " + namaRuangan);
            System.out.println("Kapasitas Ruangan: " + kapasitasRuangan + " orang");
            System.out.println("Harga per Jam: $" + hargaPerJam);
            System.out.println("Jumlah Jam yang Dipesan: " + jumlahJam + " jam");
            System.out.println("Total Harga: $" + totalHarga);

            // Meminta pengguna apakah ingin melakukan pemesanan lagi
            System.out.print("\nApakah Anda ingin melakukan pemesanan lagi? (y/n): ");
            input.nextLine();
            String jawaban = input.nextLine();

            if (!jawaban.equalsIgnoreCase("y")) {
                break;
            }
        }

        
        input.close();
    }
}