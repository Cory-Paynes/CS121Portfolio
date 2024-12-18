package projectThree;
import java.util.List;
import java.util.ArrayList;


public class Bank
{
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer)
    {
        this.customers.add(customer);
    }

    public void removeCustomer(Customer customer)
    {
        customers.remove(customer);
    }


    public Customer getCustomer(int pinNumber)
    {
        for (Customer customer : customers)
        {
            if(customer.getPinNumber() == pinNumber)
            {
                return customer;
            }
        }
        return null;
    }

    public String getAllCustomerInfo()
    {
        StringBuilder customerInfo = new StringBuilder();
        for (Customer customer : customers)
        {
            customerInfo.append(customer.toString()).append("\n");
        }
        return customerInfo.toString();
    }
}
