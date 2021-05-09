//Superclass Literatur
public class Literatur {
    protected  String title;
    protected String author;
    protected String publisher;



    // buat main class Literature dengan constructor
    public Literatur (String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher= publisher;

    }

    //class method
    public void Cetak (){
        System.out.println(title);
        System.out.println("Written By: "+ author);
        System.out.println("Publisher : " + publisher);
    }
}
