import java.util.Scanner;

public class ForKelipatan23 {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int kelipatan, total  = 0, counter = 0, avg;
        
        System.out.print("Masukkan Bilangan Kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50 ; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;

            }
        }
        
        avg = total / counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, avg);
    }
}
