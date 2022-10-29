package com.company.managelibrary.model;

import java.util.Date;

public class TicketBook {
    private Reader reader;
    private Book book;
    private Date fromDate;
    private Date toDate;

    public TicketBook() {
    }

    public TicketBook(Reader reader, Book book, Date fromDate, Date toDate) {
        this.reader = reader;
        this.book = book;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "TicketBook{" +
                "reader=" + reader +
                ", book=" + book +
                ", fromDate=" + toDate +
                ", toDate=" + fromDate  +
                '}';
    }
}
