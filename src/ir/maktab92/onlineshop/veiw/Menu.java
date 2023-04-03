package ir.maktab92.onlineshop.veiw;


import java.util.Scanner;
import ir.maktab92.onlineshop.service.BuyBasket;
import ir.maktab92.onlineshop.service.ShowProduct;

public class Menu {

    public void showMenu(){
        while (true) {
            System.out.println("#######################################");
            System.out.println("Menu:1-show product");
            System.out.println("Menu:2-add product to buyBasket");
            System.out.println("Menu:3-remove product from buyBasket");
            System.out.println("Menu:4-show product that exist in buyBasket");
            System.out.println("Menu:5-show total price Of product that exist in buyBasket");
            System.out.println("Menu:6-confirm buyBasket product ");
            System.out.println("Menu:7-sign out ");
            System.out.println("#######################################");
            System.out.println("insert menu number: ");
            runProgram();
        }
    }
    public void runProgram() {
        BuyBasket buyBasket = new BuyBasket();
        Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    ShowProduct showProduct = new ShowProduct();
                    showProduct.showProductToCustomer();
                    break;
                case 2:
                    System.out.println("inter your id of product: ");
                    buyBasket.addProduct(buyBasket.setIdProduct(scanner.nextLong()));
                case 3://buyBasket.removeProduct();
                case 4:
                    buyBasket.printBuyBasket();
                    break;
                case 5:
                    buyBasket.totalPriceBuyBasket();
                    break;
                case 6:
                case 7:
                    System.exit(0);

            }

    }
}
