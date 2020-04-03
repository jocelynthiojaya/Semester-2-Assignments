public class Main {
    public static void main(String[] args){
        Bank BCA = new Bank("BCA");
        BCA.addCustomer("Ida", "Bagus");
        BCA.addCustomer("Raymond", "Bahana");
        BCA.addCustomer("Jude", "Martinez");

        System.out.println(BCA.getNumberOfCustomers());
        System.out.println(BCA.getCustomers(0));
        System.out.println(BCA.getCustomers(1));
        System.out.println(BCA.getCustomers(2));

        System.out.println(BCA.getCustomers(0).getFirstName());
        System.out.println(BCA.getCustomers(0).getLastName());

        Account newacc = new Account(1000.0);
        BCA.getCustomers(0).setAccount(newacc);
        System.out.println(BCA.getCustomers(0).getAccount());
        BCA.getCustomers(0).getAccount().deposit(2000.0);
        System.out.println(BCA.getCustomers(0).getAccount());
        BCA.getCustomers(0).getAccount().withdraw(4000.0);
        BCA.getCustomers(0).getAccount().withdraw(500.0);
        System.out.println(BCA.getCustomers(0).getAccount());
    }
}
