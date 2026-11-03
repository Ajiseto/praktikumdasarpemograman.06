import java.util.Scanner;

public class Studikasus2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine().trim();

        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Peringkat juara : ");
            int peringkat = sc.nextInt();

            if (jumlahDokumen == 4) {
                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan tidak diberikan karena bukan Juara 1, 2, atau 3.");
                }
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1=lolos, 0=tidak) : ");
            int statusPKM = sc.nextInt();

            if (jumlahDokumen == 4) {
                if (statusPKM == 1) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan tidak diberikan karena tidak lolos pendanaan.");
                }
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }

        } else {
            
            System.out.println("Status : Dana penghargaan tidak diberikan untuk kategori kegiatan ini.");
        }

        sc.close();
    }
}