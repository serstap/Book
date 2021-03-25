package com.company;

public class Book {
    private String name;
    private Publish izd;
    private int year;
    private String[] authors;



    public Book(String name, Publish izd, int year, String[] authors) {
        setName(name);
        setIzd(izd);
        setYear(year);
        setAuthors(authors);

    }
    public Book(String name, Publish izd, int year){
        this(name, izd, year, (String[]) null);
       /* setName(name);
        setIzd(izd);
        setYear(year);*/
    }

  public Book(String name, Publish izd, int year, String author){
        setName(name);
        setIzd(izd);
        setYear(year);
        setAuthors(new String[] {author});
    }

    public String getName() {
        return name;
    }

    public Publish getIzd() {
        return izd;
    }

    public int getYear() {
        return year;
    }

    public String[] getAuthors() {
        return authors;
    }

    /*public String getAuthor() {
        return author;
    }*/

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("name cant be zero.");
        this.name = name;
    }

    public void setIzd(Publish izd) {
        if (izd == null)
            throw new IllegalArgumentException("izd cant be zero.");
        this.izd = izd;
    }

    public void setYear(int year) {
        if (year <= 0)
            throw new IllegalArgumentException("year must be large than zero.");
        this.year = year;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    /*public void setAuthor(String author) {
        this.author = author;
    }*/

    public void print() {
        System.out.println(name);
        izd.print();
        System.out.println(year);
        if (authors != null)

            for (String a : authors) {
                System.out.println(a);

            }
       /* if (author != null)
            System.out.println(author);*/

    }

    public static void printAll(Book[] books) {
        for (Book c : books) {
            c.print();
            System.out.println();
        }
    }


}


