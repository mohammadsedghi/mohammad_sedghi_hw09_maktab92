package ir.maktab92.onlineshop.service;

import ir.maktab92.onlineshop.base.domain.Product;
import ir.maktab92.onlineshop.domain.*;
import ir.maktab92.onlineshop.repository.Database;
import ir.maktab92.onlineshop.repository.ProductRepository;
import ir.maktab92.onlineshop.util.MyException;
import ir.maktab92.onlineshop.util.ProductUtil;
import ir.maktab92.onlineshop.veiw.Menu;


public class BuyBasket {

    static Product[] products = new Product[5];
    Database database = new Database();
    ProductRepository productRepository = new ProductRepository();

    public Product setIdProduct(long id) {
        Product product = new Product();
        product.setId(id);
        return product;
    }

    public Product addProduct(Product product) throws MyException {
        try {
            if (products[4] != null) {
                throw new MyException("your basket is full please confirm basket or remove product");
            }
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
            Menu menu = new Menu();
            menu.showMenu();
        }
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
                    if (product.getId() == database.getRadios()[j].getId()) {
                        products[i] = database.getRadios()[j];
                        database.getRadios()[j] = null;
                        shiftBack(j, database.getRadios());
                        System.out.println("added to buyBasket");
                        System.out.println("you can only select " + (5 - (i + 1)) + "product");
                        System.out.println("number of your basket product is " + (i + 1));
                        return products[i];
                    }
                    if (product.getId() == database.getShoeColleges()[j].getId()) {
                        products[i] = database.getShoeColleges()[j];
                        database.getShoeColleges()[j] = null;
                        shiftBack(j, database.getShoeColleges());
                        System.out.println("added to buyBasket");
                        System.out.println("you can only select " + (5 - (i + 1)) + "product");
                        System.out.println("number of your basket product is " + (i + 1));
                        return products[i];
                    }
                    if (product.getId() == database.getShoeSports()[j].getId()) {
                        products[i] = database.getShoeSports()[j];
                        database.getShoeSports()[j] = null;
                        shiftBack(j, database.getShoeSports());
                        System.out.println("added to buyBasket");
                        System.out.println("you can only select " + (5 - (i + 1)) + "product");
                        System.out.println("number of your basket product is " + (i + 1));
                        return products[i];
                    }
                    if (product.getId() == database.getBooks()[j].getId()) {
                        products[i] = database.getBooks()[j];
                        database.getBooks()[j] = null;
                        shiftBack(j, database.getBooks());
                        System.out.println("added to buyBasket");
                        System.out.println("you can only select " + (5 - (i + 1)) + "product");
                        System.out.println("number of your basket product is " + (i + 1));
                        return products[i];
                    }
                    if (product.getId() == database.getArticles()[j].getId()) {
                        products[i] = database.getArticles()[j];
                        database.getArticles()[j] = null;
                        shiftBack(j, database.getArticles());
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
        ProductUtil productUtil=new ProductUtil();
        for (int i = 0; i < 5; i++) {
            if (products[i] != null) {
                if (products[i].getId() == product.getId()) {
                    if (products[i] instanceof Tv) {
                        productRepository.saveOneProduct(productUtil.getTv(), database.getTvs());
                        clearBuybasket(i,products);
                        break;
                    }
                    if (product instanceof Radio) {
                        productRepository.saveOneProduct(productUtil.getRadio(), database.getRadios());
                        clearBuybasket(i,products);
                        break;
                    }
                    if (product instanceof ShoeCollege) {
                        productRepository.saveOneProduct(productUtil.getShoeCollege(), database.getShoeColleges());
                        clearBuybasket(i,products);
                        break;
                    }
                    if (product instanceof ShoeSport) {
                        productRepository.saveOneProduct(productUtil.getShoeSport(), database.getShoeSports());
                        clearBuybasket(i,products);
                        break;
                    }
                    if (product instanceof Book) {
                        productRepository.saveOneProduct(productUtil.getBook(), database.getBooks());
                        clearBuybasket(i,products);
                        break;
                    }
                    if (product instanceof Article) {
                        productRepository.saveOneProduct(productUtil.getArticle(), database.getArticles());
                       clearBuybasket(i,products);
                        break;
                    }
                }
                System.out.println("your product is not found");
            }
        }

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
        System.out.println("total price is:" + totalPrice + "$");
    }

    public void confirmBuyBasket() {
        printBuyBasket();
        System.out.println("Payment gateway");
        if (products[0] == null) {
            System.out.println("you can not add any item to your basket");
            return;
        }

        totalPriceBuyBasket();
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
        System.out.println("your buy basket is empty");
        printBuyBasket();
    }
    public void clearBuybasket(int i, Product[] products){
        products[i] = null;
        shiftBack(i, products);
        System.out.println("remove from buyBasket");
        if (i - 1 == -1) {
            System.out.println("number of your basket product is " + (0));
        } else {

            System.out.println("number of your basket product is " + (i - 1));
        }

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
