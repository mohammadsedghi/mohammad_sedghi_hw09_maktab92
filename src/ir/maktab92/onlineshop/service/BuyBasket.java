package ir.maktab92.onlineshop.service;

import ir.maktab92.onlineshop.base.domain.Product;
import ir.maktab92.onlineshop.util.ArrayUtil;

public class BuyBasket {

Product[] products=new Product[5];
    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[products.length - 1] != null)
                System.out.println("you can not add any product to your Buy basket");
            else
                products[i] = product;
        }
    }

    public void removeProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
//            if (products[0] == null)
//                System.out.println("you can not remove any product from your Buy basket because your basket is empty");
            if (products[i] == product) products[i] = null;
        }
    }

    public void printBuyBasket() {
        ArrayUtil arrayUtil=new ArrayUtil();
        for (int i = 0; i < products.length ; i++) {
            Product product=arrayUtil.findProduct(products[i]);
            System.out.println(product);

        }

    }

    public void totalPriceBuyBasket() {
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                totalPrice += products[i].getUnitPrice();
            }
        }
        System.out.println("total price is:"+totalPrice);
    }


}
