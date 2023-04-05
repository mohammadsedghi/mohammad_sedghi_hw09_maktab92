package ir.maktab92.onlineshop.veiw;


import java.sql.SQLOutput;
import java.util.Scanner;

import ir.maktab92.onlineshop.service.BuyBasket;
import ir.maktab92.onlineshop.service.ShowProduct;

public class Menu {

    public void showMenu() {
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
                break;
            case 3:
                System.out.println("inter your id of product: ");
                buyBasket.removeProduct(buyBasket.setIdProduct(scanner.nextLong()));
                break;
            case 4:
                buyBasket.printBuyBasket();
                break;
            case 5:
                buyBasket.totalPriceBuyBasket();
                break;
            case 6:buyBasket.confirmBuyBasket();
            break;
            case 7:
                System.out.println("you are sign out if you want exit from program please inter 0");
                System.out.println("else if you want log in inter any number except zero");
                int status = scanner.nextInt();
                if (status == 0) System.exit(0);
                else {
                    LogIn logIn=new LogIn();
                    logIn.logIn();
                }


        }

    }

    public void showLogInOrSignInMenu() {
        LogIn logIn=new LogIn();
        System.err.println("logIn=======OR=======SignIn");
        System.out.println("if you want logIn please inter 1 and if you want signIn please inter 2");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                logIn.logIn();
            case 2:
                logIn.signIn();
        }
    }
}
