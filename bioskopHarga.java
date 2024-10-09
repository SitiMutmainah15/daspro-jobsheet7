import java.util.Scanner; 

public class bioskopHarga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPertiket = 50000, totalTiket = 0, jumlahTiket;
        double diskon, totalHarga, totalDiskon, hargaBayar, totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0 ) {
                break;
            } if (jumlahTiket < 0 ) {
                System.out.println("Input tidak valid");
                continue;
            } 
            if (jumlahTiket > 10) {
            diskon = 0.15;
            } else if (jumlahTiket > 4) {
            diskon = 0.1;
            } else {
                diskon = 0;
            }

            totalHarga = hargaPertiket * jumlahTiket; 
            totalDiskon = totalHarga * diskon; 
            hargaBayar = totalHarga - totalDiskon; 

            totalTiket += jumlahTiket;
            totalPenjualan += hargaBayar; 

            System.out.println("Total harga pengunjung: Rp " + totalHarga);
            System.out.println("Diskon yang didapat pengunjung: Rp " + totalDiskon);
            System.out.println("Harga bayar pengunjung: Rp " + hargaBayar);

    }
            System.out.println("Total Tiket Terjual Hari Ini: " + totalTiket);
            System.out.println("Total Penjualan Tiket Hari Ini : Rp " + totalPenjualan);
    }
}
