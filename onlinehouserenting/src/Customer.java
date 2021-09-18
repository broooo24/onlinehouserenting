import java.util.ArrayList;

public class Customer extends Person{
    private boolean isBanned;

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned() {
        this.setName("");
        this.setPhone(0);
        this.setEmail("");
    }

    public Customer(String name, int phone, String email) {
        super(name, phone, email);
    }

    public static void showAllRent(ArrayList list){
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
