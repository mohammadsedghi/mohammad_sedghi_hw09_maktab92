package ir.maktab92.onlineshop.repository;

import ir.maktab92.onlineshop.base.domain.Product;
import ir.maktab92.onlineshop.domain.*;

import java.util.ArrayList;


public class ProductRepository {
    Database database = new Database();

    public void saveProduct(Product product) {
        Product[] products = new Product[5];
        if (product instanceof Tv) {
            Tv[] tvs = new Tv[5];
            Tv tv = (Tv) product;
            for (int i = 0; i < products.length; i++) {
                tvs[i] = tv;
            }
            products = tvs;
            database.setTvs(((Tv[]) products));
        }
        if (product instanceof Radio) {
            Radio[] radios = new Radio[5];
            Radio radio = (Radio) product;
            for (int i = 0; i < products.length; i++) {
                radios[i] = radio;
            }
            products = radios;
            database.setRadios(((Radio[]) products));
        }
        if (product instanceof ShoeCollege) {
            ShoeCollege[] shoeColleges = new ShoeCollege[5];
            ShoeCollege shoeCollege = (ShoeCollege) product;
            for (int i = 0; i < products.length; i++) {
                shoeColleges[i] = shoeCollege;
            }
            products = shoeColleges;
            database.setShoeColleges(((ShoeCollege[]) products));
        }
        if (product instanceof ShoeSport) {
            ShoeSport[] shoeSports = new ShoeSport[5];
            ShoeSport shoeSport = (ShoeSport) product;
            for (int i = 0; i < products.length; i++) {
                shoeSports[i] = shoeSport;
            }
            products = shoeSports;
            database.setShoeSports(((ShoeSport[]) products));
        }
        if (product instanceof Book) {
            Book[] books = new Book[5];
            Book book = (Book) product;
            for (int i = 0; i < products.length; i++) {
                books[i] = book;
            }
            products = books;
            database.setBooks(((Book[]) products));
        }
        if (product instanceof Article) {
            Article[] articles = new Article[5];
            Article article = (Article) product;
            for (int i = 0; i < products.length; i++) {
                articles[i] = article;
            }
            products = articles;
            database.setArticles(((Article[]) products));
        }



    }

    public void saveOneProduct(Product product, Product[] products) {

        if (product instanceof Tv) {
            Tv tv = (Tv) product;
            for (int i = 0; i < products.length; i++) {
                if (products[i] == null) {
                    products[i] = tv;
                    break;
                }

            }
            database.setTvs(((Tv[]) products));
        }
        //TODO OTHER TYPE

    }

    public Product[] loadAll(Product product) {
        Product[] products;
        if (product instanceof Tv) {
            products = database.getTvs();
            return products;
        }
        // TODO OTHER TYPE
        return null;
    }

}
