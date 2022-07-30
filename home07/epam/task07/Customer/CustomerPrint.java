package home07.epam.task07.Customer;

import java.util.List;

public class CustomerPrint {
    public void printCustomer(List<Customer> customerList) {

        for (Customer cs : customerList) {
            System.out.println("id: " + cs.getId() + " surname: " + cs.getSurname() + " name: " + cs.getName() +
                    " patronymic: " + cs.getPatronymic() + " address: " + cs.getAddress() + " creditCard: " + cs.getCreditCard() +
                    " bankAccount: " + cs.getBankAccount());
        }
    }
}
