package SOLID.ocp;

public class Book {
    private String name;
    private  String writer;
    private String pubDate;
    private int soldCopies;
    public Book(String name, String writer, String pubDate, int soldCopies){
        this.name = name;
        this.writer= writer;
        this.pubDate = pubDate;
        this.soldCopies = soldCopies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public int getSoldCopies() {
        return soldCopies;
    }

    public void setSoldCopies(int soldCopies) {
        this.soldCopies = soldCopies;
    }


}

