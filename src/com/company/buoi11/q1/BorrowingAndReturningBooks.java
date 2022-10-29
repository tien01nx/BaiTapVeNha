package com.company.buoi11.q1;

import java.time.LocalDate;

public class BorrowingAndReturningBooks {
//    người mượn, sách được mượn, ngày mượn, ngày ạn phải trả
    private  String borrower,borrowedBooks;
    private LocalDate borrowedDate,dueDate;

    public BorrowingAndReturningBooks() {
    }

    public BorrowingAndReturningBooks(String borrower, String borrowedBooks, LocalDate borrowedDate, LocalDate dueDate) {
        this.borrower = borrower;
        this.borrowedBooks = borrowedBooks;
        this.borrowedDate = borrowedDate;
        this.dueDate = dueDate;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(String borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "BorrowingAndReturningBooks{" +
                "borrower='" + borrower + '\'' +
                ", borrowedBooks='" + borrowedBooks + '\'' +
                ", borrowedDate=" + borrowedDate +
                ", dueDate=" + dueDate +
                '}';
    }
}

