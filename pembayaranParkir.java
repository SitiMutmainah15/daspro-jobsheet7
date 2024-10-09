import java.util.Scanner; 

public class pembayaranParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int durasiParkir, jenisKendaraan, totalPembayaran = 0;

        System.out.println("=== SISTEM PEMBAYARAN PARKIR ===");

        while (true) {
        System.out.println("Masukkan jenis kendaraan anda: ");
        System.out.println("ketik 1 untuk motor, 2 untuk mobil, 0 untuk keluar");
        jenisKendaraan = sc.nextInt();

        if (jenisKendaraan == 0) {
            break;
        }

        System.out.print("Masukkan berapa jam parkir anda: ");
        durasiParkir = sc.nextInt();

        if (jenisKendaraan == 1 || jenisKendaraan == 2) {
            if (durasiParkir > 5) {
                totalPembayaran += 12500; 
            } else if (jenisKendaraan == 1) { 
                totalPembayaran += 2000 * durasiParkir; 
            } else { 
                totalPembayaran += 3000 * durasiParkir; 
            }
        } else {
            System.out.println("Input jenis kendaraan tidak valid. Masukkan lagi.");
        }
    }
    System.out.println("=== RINCIAN PEMBAYARAN PARKIR ===");
    System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);
}
}
