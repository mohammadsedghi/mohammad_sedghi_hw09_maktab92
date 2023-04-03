package ir.maktab92.onlineshop.service;

import ir.maktab92.onlineshop.base.domain.Product;
import ir.maktab92.onlineshop.domain.Tv;
import ir.maktab92.onlineshop.repository.Database;
import ir.maktab92.onlineshop.util.ArrayUtil;

public class BuyBasket {

    Product[] products = new Product[5];
    Database database = new Database();

    public Product setIdProduct(long id) {
        Product product = new Product();
        product.setId(id);
        return product;
    }

    public Product addProduct(Product product) {
        for (int i = 0; i < 5; i++) {
            if(products[i]==null) {
                for (int j = 0; j < 5; j++) {
                    if (product.getId() == database.getTvs()[j].getId()) {
                        products[i] = database.getTvs()[j];
                        database.getTvs()[j] = null;
                        System.out.println("added to buyBasket");
                        System.out.println("you can only select " + (5 - (i + 1)) + "product");
                        System.out.println("number of your basket product is " + (i + 1));
                        return products[i];
                    }
                }
            }
        }
        System.out.println("your product is not found");
        return null;
    }

    public void removeProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
//            if (products[0] == null)
//                System.out.println("you can not remove any product from your Buy basket because your basket is empty");
            if (products[i] == product) products[i] = null;
        }
    }

    public void printBuyBasket() {

        for (Product p:products
             ) {
            System.out.println(p);
        }

    }

    public void totalPriceBuyBasket() {
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                totalPrice += products[i].getUnitPrice();
            }
        }
        System.out.println("total price is:" + totalPrice);
    }


}
