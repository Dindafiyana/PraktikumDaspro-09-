import java.util.Scanner;

public class StudiKasus109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000;
        System.out.println("Masukkan jumlah cup");
        int jumlahCup = sc.nextInt();
        System.out.println("Masukkan uang bayar");
        int uangBayar = sc.nextInt();
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        totalHarga= jumlahCup*hargaPerCup;
        diskon =  0;

       if (totalHarga >=100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga : Rp " + totalHarga);
        System.out.println("Diskon      : Rp " + diskon);
        System.out.println("Total bayar : Rp " + totalBayar);

         if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian   : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }



    }
}