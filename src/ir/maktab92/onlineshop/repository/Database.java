package ir.maktab92.onlineshop.repository;
import ir.maktab92.onlineshop.base.domain.Product;
import  ir.maktab92.onlineshop.base.domain.User;
import ir.maktab92.onlineshop.domain.*;

import java.util.ArrayList;

public class Database {
    public static final int DEFAULT_ARRAY_LENGTH = 5;

    private static User[] users = new User[DEFAULT_ARRAY_LENGTH];
    private static Tv[] tvs = new Tv[DEFAULT_ARRAY_LENGTH];

    private static Radio[] radios = new Radio[DEFAULT_ARRAY_LENGTH];
    private static ShoeSport[] shoeSports = new ShoeSport[DEFAULT_ARRAY_LENGTH];
    private static ShoeCollege[] shoeColleges = new ShoeCollege[DEFAULT_ARRAY_LENGTH];
    private static Book[] books = new Book[DEFAULT_ARRAY_LENGTH];

    public static User[] getUsers() {
        return users;
    }

    public static void setUsers(User[] users) {
        Database.users = users;
    }

    public static Tv[] getTvs() {
        return tvs;
    }

    public static void setTvs(Tv[] tvs) {
        Database.tvs = tvs;
    }

    public static Radio[] getRadios() {
        return radios;
    }

    public static void setRadios(Radio[] radios) {
        Database.radios = radios;
    }

    public static ShoeSport[] getShoeSports() {
        return shoeSports;
    }

    public static void setShoeSports(ShoeSport[] shoeSports) {
        Database.shoeSports = shoeSports;
    }

    public static ShoeCollege[] getShoeColleges() {
        return shoeColleges;
    }

    public static void setShoeColleges(ShoeCollege[] shoeColleges) {
        Database.shoeColleges = shoeColleges;
    }

    public static Book[] getBooks() {
        return books;
    }

    public static void setBooks(Book[] books) {
        Database.books = books;
    }
}
