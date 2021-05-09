public class Jurnal extends Literatur{
    private String institution;
    private String doi;
    private String volume;
    private String year;


    public Jurnal (String title, String author, String publisher,  String institution, String doi, String volume, String year ) {
        super (title,author, publisher);
        this.institution= institution;
        this.doi = doi;
        this.volume= volume;
        this.year = year;
    }

    //override method Cetak dari superclass
    @Override public void  Cetak () {
        super.Cetak();
        System.out.println("Institution: " + institution);
        System.out.println("DOI # : " + doi );
        System.out.println("Volume: " + volume);
        System.out.println("Tahun: " + year + "\n");
    }
}
