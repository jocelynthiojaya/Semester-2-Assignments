import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private int numberOfCustomers = 0;
    private String bankName;

    public Bank(String bName){
        this.bankName = bName;
    }


    public void addCustomer(String f, String l){
        Customer newCustomer = new Customer(f, l);
        this.customers.add(newCustomer);
        this.numberOfCustomers += 1;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomers(int index) {
        return customers.get(index);
    }
}
