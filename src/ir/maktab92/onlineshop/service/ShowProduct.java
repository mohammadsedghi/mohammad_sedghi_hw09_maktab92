package ir.maktab92.onlineshop.service;

import ir.maktab92.onlineshop.base.domain.Product;
import ir.maktab92.onlineshop.domain.Tv;
import ir.maktab92.onlineshop.repository.ProductRepository;

public class ShowProduct {

ProductRepository productRepository =new ProductRepository();



public void showProductToCustomer(){
    Tv tv=new Tv();
    //TODO OTHER TYPE
  for (Product p: productRepository.loadAll(tv)
       ) {

    System.out.println(p);
  }
}
}
