import java.util.Scanner;
class StudiKasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = input.nextLine();
        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = input.nextInt();
        String status = "";

        if (jumlahDokumen == 4) {
            if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
                jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
                jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
                
                System.out.print("Peringkat juara : ");
                int peringkat = input.nextInt();
                if (peringkat >= 1 && peringkat <= 3) {
                    status = "Selamat! Anda memenuhi ketentuan untuk menerima dana penghargaan.";
                } else {
                    status = "Maaf, dana penghargaan hanya diberikan kepada peraih Juara 1, 2, atau 3.";
                }
            }
    }
}

