public class Kategori {
    private String namakategori;
    private Buku[] buku;
    private int jumlahbuku = 0;

    public Kategori(String namakategori, Buku... buku){
        this.namakategori = namakategori;
        this.buku = buku;
    }

    public void tambahBuku(Buku buku){
        this.buku[jumlahbuku] = buku;
        jumlahbuku++;
    }

    public void TampilkanDaftarBuku(){
        System.out.println("Daftar Buku Kategori " + namakategori);
        System.out.println("Jumlah Buku : " + (buku.length));
        System.out.println("---------------");
        for (int i = 0; i < buku.length; i++){
            System.out.println((i+1) + ".");
            buku[i].TampilkanDetailBuku();
        }
    }

}
