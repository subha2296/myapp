package RecordTransaction;

public class transactionrecords {
    long debit_account_no;
    long credit_account_no;
    long transaction_amount;
    //String start_date;
    //String end_date;

    public void transactionrecords(long debit,long credit,long transaction){
        debit_account_no=debit;
        credit_account_no=credit;
        transaction_amount=transaction;
    }
    public long Debit_transaction(long debit_account_no,long transaction_amount) {
        debit_account_no = debit_account_no - transaction_amount;
        return debit_account_no;
    }

    public long credit_transaction(long credit_account_no,long transaction_amount) {
        credit_account_no = credit_account_no + transaction_amount;
        return credit_account_no;
    }


}