package ir.maktab92.onlineshop.repository;

import ir.maktab92.onlineshop.base.domain.Product;
import ir.maktab92.onlineshop.domain.Radio;
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

    }

    public Product[] loadAll() {
        Product[] products;
        products = database.getTvs();
        return products;
    }

}
