import java.util.Scanner;
class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
 
        int i = 0;
        while (i <= n) {
            int j = 0;
            System.out.print("[i=" + i + "] ");
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
