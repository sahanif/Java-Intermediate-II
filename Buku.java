//buat subsclass buku dari inheritance Literatur
public class Buku extends Literatur {

    private String isbn;
    private String genre;

    //buat constructor buku
    public Buku(String title, String author, String publisher, String isbn, String genre) {
        super (title, author, publisher);
        this.isbn = isbn;
        this.genre= genre;
    }

    //override method Cetak dari superclass
    @Override public void  Cetak () {
        super.Cetak();
        System.out.println("Jenis Genre: " + genre);
        System.out.println("ISBN # : " + isbn + "\n");
    }
}
