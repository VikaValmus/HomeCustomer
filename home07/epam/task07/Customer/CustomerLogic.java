package home07.epam.task07.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {

    public List<Customer> listCustomerCreditCard(List<Customer> customerList) {
        List<Customer> listCustomerCreditCard = new ArrayList<>();

        for (Customer cus : customerList) {
            if (cus.getCreditCard() > 100 && cus.getCreditCard() < 220) {
                listCustomerCreditCard.add(cus);
            }
        }
        return listCustomerCreditCard;
    }

    public List<Customer> getSortedCustomerList(List<Customer> customerList) {
        for (int i = 0; i < customerList.size() - 1; i++) {
            Customer min = customerList.get(i);
            int index = i;

            for (int j = i+1; j < customerList.size(); j++) {
                if (min.getSurname().compareTo(customerList.get(j).getSurname()) > 0) {
                    min = customerList.get(j);
                    index = j;
                }

                Customer temp = customerList.get(i);
                customerList.set(i, customerList.get(index));
                customerList.set(index, temp);
            }
        }
        return customerList;
    }
}
