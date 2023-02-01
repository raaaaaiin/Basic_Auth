/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authentication;

import java.util.Scanner;

/**
 *
 * @author Reyn
 */
public class Functions extends Authentication{
    public String username;
    public String password;
    public void MainScreen(){
        System.out.println("press 1 for Register");
        System.out.println("press 2 for Log in");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        int a = sc.nextInt();
        if (a == 1){
            register();
        }else if (a == 2){
            login();
        }
    }
    public void register(){
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO REGISTRATION");
        System.out.println("Please fill up the form");
        System.out.print("Username: ");
        username = sc.nextLine();
        System.out.print("Password: ");
        password = sc.nextLine();
        System.out.println("Registerd!");
        MainScreen();
    }
    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO LOGIN");
        System.out.print("Username: ");
        String Uusername = sc.nextLine();
        System.out.print("Password: ");
        String Upassword = sc.nextLine();
        if (authentication(Uusername,Upassword) == true){
            System.out.println("Log in Succesful");
        }else{
            System.out.println("Wrong Username or Password");
        }
        
    }
    public boolean authentication(String a, String b){
        boolean auth = false;
        if (a.equalsIgnoreCase(username) && b.equalsIgnoreCase(password)){
            auth = true;
        }else{
            auth = false;
        }
        return auth;
    }
}
