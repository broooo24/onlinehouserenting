public class Admin extends Person{
    public Admin(String name, int phone, String email) {
        super(name, phone, email);
    }

    public void banOwner(Owner owner){
        owner.setBanned();
    }

    public void banCustomer(Customer customer){
        customer.setBanned();
    }
}
