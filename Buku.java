public class Buku {
    private String namabuku;
    private Penulis[] penulis;
    private String sinopsis;
    private int tahunterbit;

    public Buku(String namabuku,String sinopsis,int tahunterbit, Penulis... penulis){
        this.namabuku = namabuku;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
        this.tahunterbit = tahunterbit;
    }

    public Buku(){}

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
