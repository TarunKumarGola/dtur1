package com.example.sachin.dtures;

public class Books {





    private String bookdownloadlink;
    private String booktitle;
    private String booktype;

    public Books() {
    }

    public Books(String bookdownloadlink, String booktitle, String booktype) {
        this.bookdownloadlink = bookdownloadlink;
        this.booktitle = booktitle;
        this.booktype=booktype;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public String getBookdownloadlink() {
        return bookdownloadlink;
    }

    public void setBookdownloadlink(String bookdownloadlink) {
        this.bookdownloadlink = bookdownloadlink;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }
}
