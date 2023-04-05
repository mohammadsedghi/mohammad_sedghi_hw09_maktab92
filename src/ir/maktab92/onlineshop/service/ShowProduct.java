package ir.maktab92.onlineshop.service;

import ir.maktab92.onlineshop.base.domain.Product;
import ir.maktab92.onlineshop.domain.*;
import ir.maktab92.onlineshop.repository.ProductRepository;

public class ShowProduct {

    ProductRepository productRepository = new ProductRepository();


    public void showProductToCustomer() {
        Tv tv = new Tv();
        Radio radio=new Radio();
        ShoeCollege shoeCollege=new ShoeCollege();
        ShoeSport shoeSport=new ShoeSport();
        Book book=new Book();
        Article article=new Article();

        for (Product p :productRepository.loadAll(tv)
        ) {
            System.out.println(p);
        }
        for (Product p : productRepository.loadAll(radio)
        ) {
            System.out.println(p);
        }
        for (Product p : productRepository.loadAll(shoeCollege)
        ) {
            System.out.println(p);
        }
        for (Product p : productRepository.loadAll(shoeSport)
        ) {
            System.out.println(p);
        }
        for (Product p : productRepository.loadAll(book)
        ) {
            System.out.println(p);
        }
        for (Product p : productRepository.loadAll(article)
        ) {
            System.out.println(p);
        }
    }
}
