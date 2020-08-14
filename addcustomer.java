package RecordTransaction;

public class addcustomer {
   String customerID;
    String acc_name;
    String gender;
    String age;
    String ph_no;

    public addcustomer(String name, String a ,String g, String ID,String no) {
        acc_name = name;
        age = a;
        customerID = ID;
        gender = g;
        ph_no = no;
    }

    public void add_customer(String name, String a ,String g, String ID,String no) {
        /*System.out.println(acc_name);
        System.out.println(age);
        System.out.println(customerID);
        System.out.println(gender);
        System.out.println(ph_no);*/
        acc_name = name;
        age = a;
        customerID = ID;
        gender = g;
        ph_no = no;
    }
}
