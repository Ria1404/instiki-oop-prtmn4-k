package array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[][] meja = new String[3][3];
        Scanner scan = new Scanner(System.in);

        // Mengisi setiap meja
        for (int bar = 0; bar < meja.length; bar++) {
            for (int kol = 0; kol < meja[bar].length; kol++) {
                System.out.format("Siapa yang akan duduk di meja (%d,%d): ", bar, kol);
                meja[bar][kol] = scan.nextLine();
            }
        }

        // Menampilkan isi array
        System.out.println("----------------------------------");
        for (int br = 0; br < meja.length; br++) {
            for (int kl = 0; kl < meja[br].length; kl++) {
                System.out.printf("Meja %d,%d ditempati oleh %s\n", br, kl, meja[br][kl]);
            }
            System.out.println();
        }
    }
}
