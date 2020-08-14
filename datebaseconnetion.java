import RecordTransaction.addcustomer;
import RecordTransaction.addaccount;
import RecordTransaction.transactionrecords;
import java.util.Scanner;

public class datebaseconnetion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repeat;
        int account_number = 0;
do {
    int a = sc.nextInt();
    switch (a) {
        case 1:
            System.out.println("Enter the customer details");
            System.out.println("Enter the customer name");
            String customer_name = sc.next();
            System.out.println("Enter the customer age");
            String customer_age = sc.next();
            System.out.println("Enter the customer ID");
            String customer_ID = sc.next();
            System.out.println("Enter the customer gender");
            String gender = sc.next();
            System.out.println("Enter the customer ph.no");
            String ph_no = sc.next();
            addcustomer customer = new addcustomer(customer_name, customer_age, customer_ID, gender, ph_no);
            customer.add_customer(customer_name, customer_age, customer_ID, gender, ph_no);
            break;

        case 2:
            System.out.println("Enter the account number");
            account_number = sc.nextInt();
            System.out.println("Enter the account holder age");
            String age = sc.next();
            System.out.println("Enter the account holder name");
            String account_name = sc.next();
            System.out.println("Enter the account type");
            String account_type = sc.next();
            System.out.println("Enter the account holder ph.no");
            String phone_no = sc.next();
            addaccount add = new addaccount(account_number, age, account_name, account_type, phone_no);
            add.add_account(account_number, age, account_name, account_type, phone_no);
            break;

            case 3:
                int n= sc.nextInt();
                transactionrecords c[]=new transactionrecords[n];
                for(int i=1;i<=c.length;i++) {
                    System.out.println("Enter the account number");
                    long debit_account = sc.nextInt();
                    System.out.println("Enter the transaction amount");
                    long transaction_amount = sc.nextInt();
                    transactionrecords records = new transactionrecords();
                    String trans_type = sc.next();

                    if (trans_type.equals("debit"))
                        records.Debit_transaction(account_number,transaction_amount);
                    else if (trans_type.equals("credit"))
                        System.out.println(records.credit_transaction(account_number,transaction_amount));
                }
                break;
    }repeat = sc.next();
}while(repeat.equals("do")) ;
    }

}




/*

import java.util.*;
class Account1 {
    String name, acc_type;
    int Acc_num, Acc_Balance;

    Account1() {

    }

    Account1(String n, int acc_num, int b, String a_t) {
        name = n;
        Acc_num = acc_num;
        Acc_Balance = b;
        acc_type = a_t;
    }


    class create_account extends Account {
        create_account(String n, int acc_num, int b, String a_t) { // pass name and account type
            name = n;
            Acc_num = acc_num;
            Acc_Balance = b;
            acc_type = a_t;
        }

        create_account() {
            super();
        }

        void insert(String n, int acc_num, String a_t) {
            name = n;
            acc_type = a_t;
            Acc_num = acc_num;
            Acc_Balance = 0;
        }

        void display_details() {
            System.out.println("Depositor Name :" + name);
            System.out.println("Account Number : " + Acc_num);
            System.out.println("Account Balance : " + Acc_Balance);
            System.out.println("Account Type : " + acc_type);
        }

        void deposite(int acc_num, int money) {
            Acc_Balance = money;
        }

        int withdraw(int withd) {
            Acc_Balance = Acc_Balance - withd;
            return Acc_Balance;
        }

    }


    public class Main {
        public  static void main(String args[]) {
            String user_name = null, type;
            type = null;
            int balance = 0, tmp = 0;
            int withd = 0, cb = 0;

            int aNumber = 0;
            aNumber = (int) ((Math.random() * 9000) + 1000);

            create_account user = new create_account("user", 0, 0, "savings");

            Scanner in = new Scanner(System.in);
            Scanner strng = new Scanner(System.in);
            int userChoice;
            boolean quit = false;

            do {
                System.out.println("1. Create Account");
                System.out.println("2. Deposit money");
                System.out.println("3. Withdraw money");
                System.out.println("4. Check balance");
                System.out.println("5. Display Account Details");
                System.out.println("0. to quit: \n");
                System.out.print("Enter Your Choice : ");
                userChoice = in.nextInt();
                switch (userChoice) {

                    case 1:
                        System.out.print("Enter your Name : ");
                        user_name = strng.nextLine();
                        System.out.print("Enter Accout Type : ");
                        type = in.next();
                        user.insert(user_name, aNumber, type);  // inserted
                        System.out.println("\n\tYour Account Details\n\tDont Forget Account Number\n");
                        System.out.println("**************************");
                        user.display_details();
                        break;

                    case 2: // deposite
                        System.out.print("Enter your account Number : ");
                        tmp = in.nextInt();
                        if (tmp == user.Acc_num) {
                            System.out.print("Enter Amount Of Money : ");
                            balance = in.nextInt();
                            user.Acc_Balance = balance;
                            System.out.println("\t Successfully Deposited.");
                        } else
                            System.out.println("Wrong Accoount Number.");
                        break;

                    case 3: // withdraw money
                        System.out.print("Enter your account Number : ");
                        tmp = in.nextInt();

                        if (tmp == user.Acc_num) {
                            if (user.Acc_Balance == 0)
                                System.out.print("Your Account is Empty.");

                            else {
                                System.out.print("Enter Amout Of Money : ");
                                withd = in.nextInt();

                                if (withd > user.Acc_Balance) {
                                    System.out.print("Enter Valid Amout of Money : ");
                                    withd = in.nextInt();
                                } else
                                    cb = user.withdraw(withd);
                                System.out.println("Your Current Balance : " + cb);
                            }
                        } else
                            System.out.println("Wrong Accoount Number.");
                        break;

                    case 4: // check balance

                        System.out.print("Enter your Account Number : ");
                        tmp = in.nextInt();

                        if (tmp == user.Acc_num) {
                            System.out.println("Your Current Balance : " + user.Acc_Balance);
                        } else
                            System.out.println("Wrong Accoount Number.");
                        break;

                    case 5: // display all info

                        System.out.print("Enter your Account Number :");
                        tmp = in.nextInt();
                        if (tmp == user.Acc_num) {
                            user.display_details();
                        } else
                            System.out.println("Wrong Accoount Number.");

                        break;
                    case 0:
                        quit = true;
                        break;
                    default:
                        System.out.println("Wrong Choice.");
                        break;
                }
                System.out.println("\n");
            } while (!quit);
            System.out.println("Thanks !");

        }
    }
}

*/