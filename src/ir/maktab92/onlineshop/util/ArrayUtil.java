package ir.maktab92.onlineshop.util;

import ir.maktab92.onlineshop.base.domain.Product;
import ir.maktab92.onlineshop.domain.Radio;
import ir.maktab92.onlineshop.domain.Tv;
import ir.maktab92.onlineshop.repository.ProductRepository;

public class ArrayUtil {
    Tv tv=new Tv(1l,100,"SonyTV",220," has a Oltra Hd screen ",43);
    Radio radio=new Radio(2l,10,"SonyRadio",220," has a multi waves:FM,MW,SW ","FM,MW,SW");

   public void createProduct(){
     ProductRepository productRepository =new ProductRepository();
     productRepository.saveProduct(tv);
     productRepository.saveProduct(radio);
   }




    public Product findProduct(Product product){

        if (product instanceof Tv) return new Tv();
        return null;
    }
}
