package com.xinqi.ihandwh.Model;

/**
 * Created by syd on 2015/11/22.
 */
public class BookRouteInfo {
    String bookname,bookcode,bookdetails,bookpos,book_total,book_last;

    public void setBook_last(String book_last) {
        this.book_last = book_last;
    }

    public String getBook_last() {
        return book_last;
    }

    public void setBook_total(String book_total) {
        this.book_total = book_total;
    }

    public String getBook_total() {
        return book_total;
    }

    public String getBookcode() {
        return bookcode;
    }

    public String getBookdetails() {
        return bookdetails;
    }

    public String getBookname() {
        return bookname;
    }

    public String getBookpos() {
        return bookpos;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode;
    }

    public void setBookdetails(String bookdetails) {
        this.bookdetails = bookdetails;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setBookpos(String bookpos) {
        this.bookpos = bookpos;
    }
}
