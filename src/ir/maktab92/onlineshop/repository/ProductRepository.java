package ir.maktab92.onlineshop.repository;

import ir.maktab92.onlineshop.base.domain.Product;
import ir.maktab92.onlineshop.domain.Radio;
import ir.maktab92.onlineshop.domain.ShoeCollege;
import ir.maktab92.onlineshop.domain.Tv;

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
