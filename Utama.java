public class Utama {
    private static void main (String[] args) {

        //buat object a dari class Buku
        Buku a = new Buku("Matahari",
                "Tere Liye",
                "Gramedia",
                "97860239034",
                "Novel Remaja");

        //buat object b dari class Jurnal
        Jurnal b = new Jurnal("Persepsi Wisatawan Terhadap Kualitas Pelayanan Pramuwisata di Bali",
                "IBS Putra",
                "Jurnal IPTA",
                "Universitas Udayana",
                "https://doi.org/10.24843/IPTA.2017.v05.i01.p07",
                "Vo. 5 no. 1",
                "2017");

        //Panggil method Cetak dari superclass
        a.Cetak();
        b.Cetak();
    }
}
