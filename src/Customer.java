public class Customer {
    String name;
    String email;
    int age;
    int customerId;

    public Customer(String name, String email, int age, int customerId) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getCustomerId() {
        return customerId;
    }
}
