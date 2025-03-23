import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buku {
    private String namabuku;
    private Penulis[] penulis;
    private String sinopsis;
    private int tahunterbit;
    //Deklarasi variabel baru yaitu integer penjualan bulanan untuk memenuhi ketentuan dari soal (ada penjualannya)
    private int penjualanbulanan = 0;

    public Buku(String namabuku,String sinopsis,int tahunterbit, Penulis... penulis){
        this.namabuku = namabuku;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
        this.tahunterbit = tahunterbit;
    }

    public Buku(){}

    //TUGAS 3

    //Method setter dengan return type void bernama setPenjualan dengan parameter integer penjualan, pada method ini, variabel penjualanbulanan yang dideklarasikan dalam class akan diisi oleh nilai penjualanbulanan pada parameter dengan menggunakan keyword this
    public void setPenjualan(int penjualanbulanan){
        this.penjualanbulanan = penjualanbulanan;
    }

    //Method getter dengan nama hitungRoyalti yang dengan pengembalian variabel double dan juga parameter yang hanya berisi satu variabel yang bersifat double dengan nama hargajual, method ini akan mengembalikan nilai perhitungan royalti dengan rumus 0,1 x harga jual x penjualan bulanan yang bertipe double
    public double hitungRoyalti(double hargajual){
        return 0.1 * hargajual * penjualanbulanan;
    }

    //Method getter dengan nama hitungRoyalti yang dengan pengembalian variabel double dan juga dua parameter yang variabel yang bersifat double dengan nama hargajual dan double dengan nama persentase (persentase harus double agar pada saat pengembalian apabila hasil pembagian persentase dengan 100 bersifat desimal maka angka desimal tersebut akan ikut juga), method ini akan mengembalikan nilai perhitungan royalti dengan rumus (persentase/100) x harga jual x penjualan bulanan yang bertipe double
    public double hitungRoyalti(double hargajual, double persentase){
        return (persentase / 100) * hargajual * penjualanbulanan;
    }




    //BAHAN BELAJAR HIRAUKAN SAJA

    //Method baca file dengan parameter nama file yang bakal diisi ke class FileReader
    public void bacaFile(String namaFile){
        //Try catch untuk exception handling apabila ada kesalahan yang terjadi (buffered reader wajib dikasih exception handling karena ada exception yang wajib diselesain (disuruh sistem jir), salah satunya karena bisa ada masalah route file yang ga ada) 
        try {
            //Inisialisasi objek reader dari class BufferedReader yang berfungsi untuk membaca file, dan objek class FileReader diisi dengan nama file beserta tipe filenya (cth : .txt) untuk jadi sasaran file yang akan dibaca (bisa juga ditambahin directorynya, tapi harus make duoble slash (cth "D:\\Java\Praktikum 3\\asd.txt"))
            BufferedReader reader = new BufferedReader(new FileReader(namaFile));
            //Variabel String line buat nyimpen nilai make method readLine dari class BufferedReader, karena di soal cuma disuruh baca 1 line, jadi gaperlu make looping buat baca banyak line
            String line = reader.readLine();
            //Deklarasi array String[] atribut yang dikasih nilai dari variabel line yang dikasih method split, di parameter method split aku kasih string ";" untuk misah tiap bagian sesuai dengan posisi ";"
            
            //Ngisi nilai masing" atribut dari class, diambil dari setiap index array atribut yang dikasih method trim biar gaada space kosong di awal atau akhirnya (nanti format textnya di file gini ya : JUDUL; PENULIS (bisa banyak, tapi harus dipisah make koma misalnya : PENULIS 1, PENULIS 2, dst); SINOPSIS; TAHUN)
            String[] atribut = line.split(";");
            this.namabuku = atribut[0].trim();

            String[] insertPenulis = atribut[1].split(",");
            penulis = new Penulis[insertPenulis.length];

            //Make for each buat bikin banyak objek penulis yang bakalan dimasukin ke variabel array penulis sebagai atribut
            //Integer index buat ngisi array penulis
            int index = 0;
            for(String namapenulis : insertPenulis){
                this.penulis[index] = new Penulis(namapenulis);
                index++;
            }

            this.sinopsis = atribut[2].trim();
            //Make parseInt buat ngubah string ke int
            this.tahunterbit = Integer.parseInt(atribut[3].trim());

            //Kalo misalnya lebih dari 1 line bisa make gini (harusnya)
            // berkali kali make read line, nanti dibagi beberapa block secara berurutan (kalo manggil readline bakalan baca baris teratas, kalo udah dibaca, read line yang selanjutnya bakalan baca baris dibawahnya, makanya orang biasa make while loop buat baca file yang barisnya banyak)
            // block pertama isinya split judul buku sama penulis
            // block kedua isinya split sinopsis sama tahun, atau bahkan kalo mau lebih banyak line lagi tinggal isi read line lagi yang buat baca atribut
            // bisa make while loop juga sebenernya, tapi bakalan ada make if else
               
            //BufferReader harus diclose untuk mencegah kebocoran memori serta banyak masalah lain yang gabisa aku sebutin
            reader.close();
       
            
        } catch (IOException e) {
            System.out.println("Error membaca file : " + e.getMessage() );
        }
    }

     //Method simpan file dengan parameter nama file yang bakal diisi ke class FileReader
    public void simpanFile(String namaFile){
        //Try catch untuk exception handling apabila ada kesalahan yang terjadi (BufferedWriter juga wajib, kayanya hampir semua io wajib ada exception handlingnya deh)
        try {
            //Deklarasi objek writer dengan class BufferedWriter dengan parameter objek dari class FileWriter yang punya parameter lagi yaitu string nama file beserta tipenya
            BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile));
            writer.write(namabuku + ";");
            if (penulis.length > 1) {
                for(int i = 0; i < penulis.length-1; i++){
                    writer.write(penulis[i].getNamaPenulis() + ",");
                }
                writer.write(penulis[penulis.length-1].getNamaPenulis() + "; ");
            } else {
                writer.write(penulis[0].getNamaPenulis() + "; ");
            }
            writer.write(sinopsis + "; " + tahunterbit);

             //BufferReader harus diclose untuk mencegah kebocoran memori serta banyak masalah lain yang gabisa aku sebutin
            writer.close();
        } catch (Exception e) {
            System.out.println("Error membaca file : " + e.getMessage() );
        }
    }

    public String getNamaBuku(){
        return namabuku;
    }

    public double cekKesamaan(Buku buku){
        int kesamaan = 0;
        if (this.namabuku.equals(buku.namabuku)) {
            kesamaan++;
        }

        if (this.penulis.equals(buku.penulis)) {
            kesamaan++;
        }

        if (this.sinopsis.equals(buku.sinopsis)) {
            kesamaan++;
        }

        if (this.tahunterbit == buku.tahunterbit) {
            kesamaan++;
        }

        return kesamaan/4*100;
    }

    public int HitungJumlahKata(){
            if (sinopsis == null || sinopsis.isEmpty()) {
                return 0;
            } else {
                String kata[] = sinopsis.split("\\s+");
                return kata.length;
            } 
    }

    public void TampilkanDetailBuku(){
        System.out.println("Nama Buku : \""+ namabuku + "\"");
        System.err.println("Sinopsis Buku : \"" + sinopsis + "\"");
        System.err.println("Tahun Terbit : " + tahunterbit);
        System.out.print("Nama Penulis : ");
        if (penulis.length > 1) {
            for (int i = 0; i < penulis.length - 1; i++){
                System.out.print(penulis[i].getNamaPenulis() + ", ");
            }
            System.out.println(penulis[penulis.length-1].getNamaPenulis() + ".");
        } else {
            System.out.println(penulis[0].getNamaPenulis() + ".");
        }
    }

    public void copy(Buku buku){
        this.namabuku = buku.namabuku;
        this.penulis = buku.penulis;
        this.sinopsis = buku.sinopsis;
        this.tahunterbit = buku.tahunterbit;
    }

}
