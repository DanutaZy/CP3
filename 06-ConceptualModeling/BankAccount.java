public class BankAccount
{  
    private String customer;
    private String customerID;
    private String accountNumber;
    private double balance;
    private final String currency="PLN";
    public BankAccount(String customer, String customerID,String accountNumber,double balance)
    {
        setCustomer(customer);
        setCustomerID(customerID);
        setAccountNumber(accountNumber);
        setBalance(balance);        
    }
    public void setCustomer(String customer)
    {
        this.customer=customer.substring(0,1).toUpperCase()+customer.substring(1).toLowerCase();        
    }
    public String getCustomer()
    {
        return customer;
    }
    public void setCustomerID(String customerID)
    {
        if(customerID.length()==9)
        {this.customerID=customerID;}
        else
        {System.out.println("Wrong length of ID");}
    }
    public String getCustomerID()
    {
        return customerID;
    }
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public double getBalance()
    {
        return balance;
    }
    private void withdraw(int x)
    {   if(x>500)
        {System.out.println("Too large withdraw number- maximum withdraw amount in one operation is 500PLN");}
        else if(x<=balance)
        {balance-=x;
         System.out.println("Succesfull withdraw operation");
        }
        else
        {System.out.println("Not enough money on account");}
    }
    private void deposit(int x)
    {
        balance+=x;
    }
    private void showBalance()
    {
        System.out.println(getBalance());
    }
    private void closeAccount()
    {
        setCustomer(null);
        setCustomerID(null);
        setAccountNumber(null);
        setBalance(0);
       
    }
    public static void main(String[] args) {
        BankAccount first= new BankAccount("anna kowalska","12345","233534532",0);
        first.deposit(500);
        first.showBalance();
        first.deposit(200);
        first.showBalance();
        first.withdraw(300);
    }
}