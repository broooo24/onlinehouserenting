import java.util.ArrayList;

public class Owner extends Person{
    private boolean isBanned;

    public Owner(String name, int phone, String email) {
        super(name, phone, email);
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned() {
        this.setName("");
        this.setPhone(0);
        this.setEmail("");
    }

    public void newRent(String address, String descriptionOfHouse, int price, int phoneNumber){
        new House(address, descriptionOfHouse, price, phoneNumber);
    }

    public void deleteRent(){

    }
}
