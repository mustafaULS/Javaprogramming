package day04_variables;

public class ShippingAddress2 {

    public static void main(String[] args) {
    /*
Declare the following variables:
    name
    buildingNumber
    streetName
    city
    state
    zipCode
Use concatenation to print the full shipping address
    EX:
		Jimmy Joe
		7925 Jones Branch Dr
		McLean, VA 20125
 */
        String name = "jimmy west",
                buildingName = "sehremini",
                steetName = "devrispasa",
                city = "istanbul",
                state = "turkiye",
                zipcode = "340001";
        //System.out.println(name + "\n" + steetName + " " + buildingName + "\n" + city + ", " + state + " " + zipcode);

        String address = name + "\n" + steetName + " " + buildingName + "\n" + city + ", " + state + " " + zipcode;

        System.out.println(address);
    }
}
