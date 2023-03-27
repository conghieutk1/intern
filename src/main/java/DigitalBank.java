public class DigitalBank {

    public Customer getCustomerById(String id) {
        Customer _customer = new Customer();
        if  (id == "123456") {
            _customer.setID("123456");
            _customer.setNAME("HIEU");
        }
        if (id == "111222") {
            _customer.setID("111222");
            _customer.setNAME("HDBK");
        }

        return _customer;
    }
    //  Customer customer = activeBank.
}
