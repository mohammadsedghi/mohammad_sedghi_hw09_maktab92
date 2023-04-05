package ir.maktab92.onlineshop.veiw;

import ir.maktab92.onlineshop.base.domain.User;
import ir.maktab92.onlineshop.domain.Address;
import ir.maktab92.onlineshop.service.SignIn;

import java.util.Arrays;
import java.util.Scanner;

public class LogIn {
    long[] listId=new long[10];
    SignIn signIn=new SignIn();
    Menu menu=new Menu();

public void signIn(){

    Scanner scanner=new Scanner(System.in);
    System.out.println("insert your name");
    String name=scanner.next();
    System.out.println("insert your family");
    String family=scanner.next();
    System.out.println("insert your phoneNumber");
    String phoneNumber=scanner.next();
    System.out.println("insert your emailAddress");
    String emailAddress=scanner.next();
    System.out.println("insert your password");
    String password=scanner.next();
    User user=new User(generateCustomerId(),name,family,phoneNumber,emailAddress,password,setCustomerAddress());
    signIn.saveUser(user);
    System.err.println("your register completed");
    logIn();
}
public long generateCustomerId(){
   Arrays.fill(listId,0);
   if (listId[0]==0)return listId[0]=100;
    for (int i = 1; i < listId.length; i++) {
      if (listId[i]==0)return listId[i]=listId[i-1]+i;
    }
    return -1;
}
public Address setCustomerAddress(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("insert province");
String province=scanner.next();
System.out.println("insert city");
    String city=scanner.next();
    System.out.println("insert street");
    String street=scanner.next();
    System.out.println("insert postalCode");
    String postalCode=scanner.next();
    Address address=new Address(province,city,street,postalCode);
    return address;
}
public void logIn(){
    Scanner scanner=new Scanner(System.in);
    System.err.println("========LOGIN=========");
    System.out.println();
    System.out.println("insert emailAddress");
    String emailAddress=scanner.next();
    System.out.println("insert password");
    String password=scanner.next();
    if (signIn.getUserInfo(emailAddress,password))menu.showMenu();
    else
    {
        System.out.println("user with this email and password not exist");
         menu.showLogInOrSignInMenu();
    }

}
}
