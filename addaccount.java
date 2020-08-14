package RecordTransaction;

public class addaccount {
    int account_number;
    String customer_age;
    String accountholder_name;
    String account_type;
    String ph_no;
    int account_balance;

    public addaccount(int accnumber, String age, String accountname, String accounttype, String phno) {
        accnumber = account_number;
        age = customer_age;
        accountname = accountholder_name;
        account_type = accounttype;
        ph_no = phno;
    }

    public void add_account(int accnumber, String age, String accountname, String accounttype, String phno) {
        /*System.out.println(account_number);
        System.out.println(customer_age);
        System.out.println(accountholder_name);
        System.out.println(account_type);
        System.out.println(ph_no);*/
        accnumber = account_number;
        age = customer_age;
        accountname = accountholder_name;
        account_type = accounttype;
        ph_no = phno;
    }

   /* public void credit(int account_number,int money){
        account_balance = money;
    }
    public int debit(int debit) {
        account_balance = account_balance - debit;
        return account_balance;
    }*/

}
