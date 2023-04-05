package ir.maktab92.onlineshop.service;

import ir.maktab92.onlineshop.base.domain.Product;
import ir.maktab92.onlineshop.domain.Tv;
import ir.maktab92.onlineshop.repository.Database;
import ir.maktab92.onlineshop.repository.ProductRepository;
import ir.maktab92.onlineshop.util.ArrayUtil;

public class BuyBasket {

    static Product[] products = new Product[5];
    Database database = new Database();
    ProductRepository productRepository = new ProductRepository();

    public Product setIdProduct(long id) {
        Product product = new Product();
        product.setId(id);
        return product;
    }

    public Product addProduct(Product product) {
        for (int i = 0; i < 5; i++) {
            if (products[i] == null) {
                for (int j = 0; j < 5; j++) {
                    if (product.getId() == database.getTvs()[j].getId()) {
                        products[i] = database.getTvs()[j];
                        database.getTvs()[j] = null;
                        shiftBack(j, database.getTvs());
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
        for (int i = 0; i < 5; i++) {
            if (products[i] != null) {
                if (products[i].getId() == product.getId()) {
                   productRepository.saveOneProduct(product, database.getTvs());
                    products[i] = null;
                    shiftBack(i, products);
                    System.out.println("remove from buyBasket");
                    System.out.println("number of your basket product is " + (i - 1));
                    return;

                }
            }
        }
        System.out.println("your product is not found");

    }

    public void printBuyBasket() {

        for (Product p : products
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
        System.out.println("total price is:" + totalPrice+"$");
    }
public void confirmBuyBasket(){
        printBuyBasket();
    System.out.println("Payment gateway");
    totalPriceBuyBasket();
    for (int i = 0; i <products.length ; i++) {
       products[i]=null;
    }
    System.out.println("your buy basket is empty");
    printBuyBasket();
}
    protected void shiftBack(int fromIndex, Product[] products) {
        for (int i = fromIndex; i < products.length; i++) {
            if (i == products.length - 1) {
                products[i] = null;
            } else {
                if (products[i + 1] != null) {
                    products[i] = products[i + 1];
                    products[i + 1] = null;
                } else {
                    break;
                }
            }
        }
    }
}
