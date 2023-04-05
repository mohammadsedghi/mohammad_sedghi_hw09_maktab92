package ir.maktab92.onlineshop.util;

import ir.maktab92.onlineshop.base.domain.Product;
import ir.maktab92.onlineshop.domain.*;
import ir.maktab92.onlineshop.repository.ProductRepository;

public class ArrayUtil {
    Tv tv=new Tv(1l,100,"SonyTV",220," has a Oltra Hd screen ",43);
    Radio radio=new Radio(2l,10,"SonyRadio",220," has a multi waves:FM,MW,SW ","FM,MW,SW");
ShoeCollege shoeCollege=new ShoeCollege(3l,15l,43,"black","natural leather",true);
 ShoeSport shoeSport=new ShoeSport(4l,20l,40,"white","football",false);
 Book book=new Book(5l,50l,1,"shahName","abolghasemFerdosi","poem",4);
  Article article=new Article(6l,120l,223,"dataMining","mohammadSedghi","LHUI","mining");

   public void createProduct(){
     ProductRepository productRepository =new ProductRepository();
     productRepository.saveProduct(tv);
     productRepository.saveProduct(radio);
     productRepository.saveProduct(shoeCollege);
     productRepository.saveProduct(shoeSport);
     productRepository.saveProduct(book);
     productRepository.saveProduct(article);


   }




    public Product findProduct(Product product){

        if (product instanceof Tv) return new Tv();
        return null;
    }
}
