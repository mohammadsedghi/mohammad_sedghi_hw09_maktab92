package ir.maktab92.onlineshop.service;

import ir.maktab92.onlineshop.base.domain.Product;
import ir.maktab92.onlineshop.repository.ProductRepository;

public class ShowProduct {
ProductRepository productRepository =new ProductRepository();
public void showProductToCustomer(){
  for (Product p: productRepository.loadAll()
       ) {
    System.out.println(p);
  }
}
}
