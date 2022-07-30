package home07.epam.task07.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerList {

    private List<Customer> customerList;

    public CustomerList() {
        customerList = new ArrayList<Customer>();
    }

    public void add(Customer customer) {
        customerList.add(customer);
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerList that = (CustomerList) o;
        return Objects.equals(customerList, that.customerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerList);
    }
}
