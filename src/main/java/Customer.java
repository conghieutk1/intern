public class Customer {
    private static String CUSTOMER_ID;
    private static int sodu;
    private static String CUSTOMER_NAME;
    private static String STK;
    public String getID() {
        return CUSTOMER_ID;
    }
    public void setID(String CUSTOMER_ID) {
        this.CUSTOMER_ID = CUSTOMER_ID;
    }
    public String getNAME() {
        return CUSTOMER_NAME;
    }
    public void setNAME(String CUSTOMER_NAME) {
        this.CUSTOMER_NAME = CUSTOMER_NAME;
    }

    public void showCustomer(String Id) {
        DigitalBank acticeBank = new DigitalBank();
        Customer customer = acticeBank.getCustomerById(Id);
        if (customer != null) {
            customer.displayInfomation(customer);
        }
    }

    public void setsodu(int sodu) {
        this.sodu = sodu;
    }
    public int getsodu() {
        return sodu;
    }

    public void setSTK(String STK) {
        this.sodu = sodu;
    }
    public String getSTK() {
        return STK;
    }
    private static void displayInfomation(Customer customer) {
        System.out.println("Ten khach hang: " + customer.CUSTOMER_NAME);
        System.out.println("Id khach hang: " + customer.CUSTOMER_ID);

    }
}
