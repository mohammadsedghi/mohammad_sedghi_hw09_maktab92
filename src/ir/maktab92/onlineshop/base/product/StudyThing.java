package ir.maktab92.onlineshop.base.product;

import ir.maktab92.onlineshop.base.domain.Product;

public class StudyThing extends Product {
    int Number;
    String name;
    String authorNameFamily;

    public StudyThing(long id, double unitPrice, int number, String name, String authorNameFamily) {
        super(id, unitPrice);
        Number = number;
        this.name = name;
        this.authorNameFamily = authorNameFamily;
    }

    public StudyThing(int number, String name, String authorNameFamily) {
        Number = number;
        this.name = name;
        this.authorNameFamily = authorNameFamily;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorNameFamily() {
        return authorNameFamily;
    }

    public void setAuthorNameFamily(String authorNameFamily) {
        this.authorNameFamily = authorNameFamily;
    }

    @Override
    public String toString() {
        return "StudyThing{" +
                "Number=" + Number +
                ", name='" + name + '\'' +
                ", authorNameFamily='" + authorNameFamily + '\'' +
                "} " + super.toString();
    }
}
