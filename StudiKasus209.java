Jobsheet5\PraktikumDaspro-09-import java.util.Scanner;

public class StudiKasus209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = sc.nextLine().toUpperCase();

        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = sc.nextInt();

        System.out.print("Peringkat juara : ");
        int peringkat = sc.nextInt();

        System.out.print("Status pendanaan PKM (1=lolos, 0=tidak) : ");
        int statusPKM = sc.nextInt();

        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {

            if (peringkat >= 1 && peringkat <= 3) {

                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dana penghargaan diberikan kepada " + nama
                        + " sebagai Juara " + peringkat + " kegiatan " + jenis + ".");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang
                        + " dokumen). Dana penghargaan tidak diberikan.");
                }

            } else {
                System.out.println("Status : " + nama + " bukan Juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }

        } else if (jenis.equals("PKM")) {

            if (statusPKM == 1) {

                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dana penghargaan diberikan kepada " + nama
                        + " untuk kegiatan PKM yang lolos pendanaan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang
                        + " dokumen). Dana penghargaan tidak diberikan.");
                }

            } else {
                System.out.println("Status : " + nama + " tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan.");
            }

        } else {
            System.out.println("Status : Kegiatan " + jenis + " tidak termasuk kategori yang mendapat dana penghargaan.");
        }

    }
}