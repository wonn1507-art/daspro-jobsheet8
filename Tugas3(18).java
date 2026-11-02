import java.util.Scanner;
class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko : ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            
            int totalBarangSemua = 0, tokoTerbanyak = 1, tokoTersedikit = 1;
            int barangTerbanyak = -1, barangTersedikit = Integer.MAX_VALUE;
            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("\nToko " + i);
                int jumlahPelanggan;
                
                do {
                    System.out.print("Jumlah pelanggan : ");
                    jumlahPelanggan = sc.nextInt();
                    
                    if (jumlahPelanggan < 0) {
                        System.out.println("Jumlah pelanggan tidak boleh negatif!");
                    }
                } while (jumlahPelanggan < 0);
                int totalBarangToko = 0;
                
                for (int j = 1; j <= jumlahPelanggan; j++) {
                    int jumlahBarang;
                    
                    do {
                        System.out.print("Jumlah barang pelanggan " + j + " : ");
                        jumlahBarang = sc.nextInt();
                        
                        if (jumlahBarang < 0) {
                            System.out.println("Jumlah barang tidak boleh negatif!");
                        }
                    } while (jumlahBarang < 0);
                    totalBarangToko += jumlahBarang;
                }
                
                System.out.println("Toko " + i + " - pelanggan : " + jumlahPelanggan + ", total barang : " + totalBarangToko);
                totalBarangSemua += totalBarangToko;
                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = i;
                }

                if (totalBarangToko < barangTersedikit) {
                    barangTersedikit = totalBarangToko;
                    tokoTersedikit = i;
                }
            }

            System.out.println("\n      RINGKASAN PENJUALAN      ");
            System.out.println("Total barang seluruh toko : " + totalBarangSemua);
            System.out.println("Toko dengan barang terbanyak : " + tokoTerbanyak);
            System.out.println("Toko dengan barang paling sedikit : " + tokoTersedikit);
        }
        sc.close();
    }
}
