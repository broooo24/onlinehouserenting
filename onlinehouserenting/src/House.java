import java.util.ArrayList;

public class House {
    private String address;
    private String descriptionOfHouse;
    private int price;
    private int phoneNumber;
    ArrayList<House> houses = new ArrayList<>();

    public House(String address, String descriptionOfHouse, int price, int phoneNumber) {
        this.address = address;
        this.descriptionOfHouse = descriptionOfHouse;
        this.price = price;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescriptionOfHouse() {
        return descriptionOfHouse;
    }

    public void setDescriptionOfHouse(String descriptionOfHouse) {
        this.descriptionOfHouse = descriptionOfHouse;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deleteElement(ArrayList<House> list,Integer number){
        System.out.println(list.get(number));
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", descriptionOfHouse='" + descriptionOfHouse + '\'' +
                ", price=" + price +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
