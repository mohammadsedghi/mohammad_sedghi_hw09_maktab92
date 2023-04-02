package ir.maktab92.onlineshop.util;

import ir.maktab92.onlineshop.base.domain.Product;
import ir.maktab92.onlineshop.domain.Tv;

public class ArrayUtil {
    public Product findProduct(Product product){

        if (product instanceof Tv) return new Tv();
        return null;
    }
}
