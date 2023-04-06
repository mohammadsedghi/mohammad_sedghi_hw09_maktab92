package ir.maktab92.onlineshop.veiw;

import ir.maktab92.onlineshop.util.MyException;
import ir.maktab92.onlineshop.util.ProductUtil;

public class Main {
    public static void main(String[] args) throws MyException {
      ProductUtil productUtil =new ProductUtil();
      productUtil.createProduct();
      Menu menu=new Menu();
       menu.showLogInOrSignInMenu();

    }
}