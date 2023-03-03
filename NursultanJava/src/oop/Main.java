package oop;


import java.util.Arrays;

public class Main {

        public static void main(String[] args) {
            Users user = new Users("Kate","Gogolya Street","katya@gmail.com",123456);
            Users user1 = new Users("Mirlan","Tokombaev Street","mirlan@gmail.com",34313467);
            user.setBalance(2333);
            user1.setBalance(900);
            Users[] users={user,user1};
            Bank bank = new Bank("Mbank","Vostok-5",users);
            bank.add();
            bank.printBankDetails();
            bank.removeByName("Mirlan");
            bank.printBankDetails();
        }


}

