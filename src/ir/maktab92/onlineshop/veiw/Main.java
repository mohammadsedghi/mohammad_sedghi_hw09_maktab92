package ir.maktab92.onlineshop.veiw;

import ir.maktab92.onlineshop.util.ArrayUtil;

public class Main {
    public static void main(String[] args) {
        ArrayUtil arrayUtil=new ArrayUtil();
        arrayUtil.createProduct();
       Menu menu=new Menu();
       menu.showMenu();
      // menu.showLogInOrSignInMenu();

    }
}