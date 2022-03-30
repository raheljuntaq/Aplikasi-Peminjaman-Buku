import java.util.Scanner;

public class PinjamBuku {

    public static void main(String[] args) {

        Scanner a = new Scanner(System. in );
        int npm, jumlah, waktu;
        String nama;

        //input data peminjaman
        System.out.println ("INPUT DATA PEMINJAM");
        System.out.println ("---------------------------------------------------------");
        System.out.print   ("Masukkan Nama       = ");
        nama = a.nextLine();
        System.out.print   ("Masukkan NPM        = ");
        npm = a.nextInt();
        System.out.print   ("Masukan Jumlah Buku = ");
        jumlah = a.nextInt();
        System.out.println("Masukkan Waktu Peminjaman (maks 14 hari)  = ");
        waktu = a.nextInt();
        System.out.println ("---------------------------------------------------------");

        // masukkan nilai array
        String judul_arr[] = new String[jumlah];

        //pengulangan judul buku
        for (int b = 0; b < jumlah; b++) {
            System.out.print("Masukan Judul Buku : ");
            judul_arr[b] = a.next();
        }

        //output detail peminjaman
        System.out.println("");
        System.out.println ("---------------------------------------------------------");
        System.out.println ("DETAIL PEMINJAMAN");
        System.out.println ("---------------------------------------------------------");
        System.out.println ("Nama Mahasiswa               = "+nama);
        System.out.println ("NPM Mahasiswa                = "+npm);
        System.out.println ("---------------------------------------------------------");
        System.out.println ("DAFTAR BUKU YANG DIPINJAM");
        System.out.println ("---------------------------------------------------------");
        System.out.println ("Waktu Peminjaman : " + waktu + " hari");

        for (int b =0;b<jumlah;b++){
            System.out.println ("Judul Buku Ke : " + (b+1) +": " + judul_arr [b]);
        }
        System.out.println ("BUKU BERHASIL DIPINJAM ANGGOTA");
        System.out.println ("HARAP MENGEMBALIKAN BUKU SESUAI WAKTU PEMINAJAN");
    }
}