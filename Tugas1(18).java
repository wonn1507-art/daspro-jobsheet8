import java.util.Scanner;
class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int total = 0, i = 1;
        
        while (i <= n) {
            int j = 1;

            while (j <= i) {
                System.out.print(j + " ");
                total++;
                j++;
            }

            System.out.println();
            i++;
        }

        System.out.println("Total angka tercetak : " + total);
        sc.close();
    }
}
