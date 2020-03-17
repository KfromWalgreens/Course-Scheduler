public class Textbook {
    private String title;
    private String publisher;
    private int edition;

    public Textbook(){
        title = "";
        publisher = "";
        edition = 0;
    }

    public Textbook(String t, String p, int e){
        title = t;
        publisher = p;
        edition = e;
    }

    public String toString(){
        return title + System.lineSeparator() + publisher + System.lineSeparator() + edition;
    }
}
