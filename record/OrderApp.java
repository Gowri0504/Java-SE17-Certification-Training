// package record;

// public class OrderApp {

//     public static void main(String[] args) {

//         Customer customer = new Customer("John", "john@email.com");

//         Address address = new Address("12A", "Chennai", "600001");

//         Order order = new Order(101, customer, address);

//         System.out.println(order);
//     }
// }


// record Customer(String name, String mail) {

//     public Customer {
//         if (name == null || name.isBlank()) {
//             throw new IllegalArgumentException("Name cannot be empty");
//         }
//         if (mail == null || mail.isBlank()) {
//             throw new IllegalArgumentException("Mail cannot be empty");
//         }
//     }
// }


// record Address(String doorNo, String city, String pincode) {

//     public Address {
//         if (city == null || city.isBlank()) {
//             throw new IllegalArgumentException("City cannot be empty");
//         }
//     }
// }


// record Order(int orderId, Customer customer, Address address) {

//     public Order {
//         if (orderId <= 0) {
//             throw new IllegalArgumentException("Order ID must be positive");
//         }
//         if (customer == null) {
//             throw new IllegalArgumentException("Customer cannot be null");
//         }
//         if (address == null) {
//             throw new IllegalArgumentException("Address cannot be null");
//         }
//     }
// }

package record;
record Customer(String name, String mail){}
record Address(String city, String pincode){}
record Order(int orderId, Customer customer, Address address){}
public class OrderApp {

    public static void main(String[] args) {

        Customer customer = new Customer("Gowri D", "gowri@email.com");

        Address address = new Address("Chennai", "600100");

        Order order = new Order(101, customer, address);

        System.out.println(order);
    }
}
