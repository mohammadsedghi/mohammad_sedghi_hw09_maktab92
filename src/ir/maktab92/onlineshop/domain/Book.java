package ir.maktab92.onlineshop.domain;

import ir.maktab92.onlineshop.base.product.StudyThing;

public class Book extends StudyThing {
 private String subject;
 private int printYear;

    public Book(long id, double unitPrice, int number, String name, String authorNameFamily, String subject, int printYear) {
        super(id, unitPrice, number, name, authorNameFamily);
        this.subject = subject;
        this.printYear = printYear;
    }

    public Book(int number, String name, String authorNameFamily, String subject, int printYear) {
        super(number, name, authorNameFamily);
        this.subject = subject;
        this.printYear = printYear;
    }

    public Book(String subject, int printYear) {
        this.subject = subject;
        this.printYear = printYear;
    }
public Book(){}
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPrintYear() {
        return printYear;
    }

    public void setPrintYear(int printYear) {
        this.printYear = printYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "subject='" + subject + '\'' +
                ", printYear=" + printYear +
                "} " + super.toString();
    }
}
