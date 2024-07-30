public class DependencyInjectionExample {
    public static void main(String[] args) {

        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        CustomerService customerService = new CustomerService(customerRepository);

        Customer customer = customerService.findCustomerById(1);
        System.out.println(customer);

        Customer anotherCustomer = customerService.findCustomerById(2);
        System.out.println(anotherCustomer);
    }
}
