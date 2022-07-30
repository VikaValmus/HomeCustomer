package home07.epam.task07.Customer;

//Создать класс Customer, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод  toString().
// Создать второй класс, агрегирующий коллекцию типа Customer, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import home06.epam.task06.Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerList customerList = new CustomerList();
        customerList.add(new Customer(1,"Petrov", "Ivan", "Ivanovich","Minsk, ul.Lenina 13,39", 123, 12345678));
        customerList.add(new Customer(2,"Ivanov", "Petr", "Petrovich","Minsk, ul.One 1,3", 134, 3451234));
        customerList.add(new Customer(3,"Sidorov", "Richer", "Ivanovich","Minsk, ul.Two 34,9", 345, 975367));
        customerList.add(new Customer(4,"Tolkien", "Ruel", "Ihorevich","Minsk, ul.Three 13,39", 254, 4687654));

        CustomerLogic customerLogic = new CustomerLogic();
       List<Customer> getSortedCustomerList = customerLogic.getSortedCustomerList(customerList.getCustomerList());

        List<Customer> listCustomerCreditCard = customerLogic.listCustomerCreditCard(customerList.getCustomerList());


        CustomerPrint customerPrint = new CustomerPrint();
        customerPrint.printCustomer(getSortedCustomerList);
        System.out.println();
        customerPrint.printCustomer(listCustomerCreditCard);
    }
}
