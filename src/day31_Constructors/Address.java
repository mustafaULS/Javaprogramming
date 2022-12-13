package day31_Constructors;

public class Address {

    public String  street,city,state;

    public int buildingNumber,zipCode;

    public Address(String street, String city, String state, int buildingNumber, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.buildingNumber = buildingNumber;
        this.zipCode = zipCode;
    }

    public String toString() {
        return buildingNumber + " "+   street + '\n' + city + " " + state + " " + zipCode;

    }


}
