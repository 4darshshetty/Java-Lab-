import java.util.*;

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String pincode;

    Address(String n, String s, String c, String st, String p) {
        name = n;
        street = s;
        city = c;
        state = st;
        pincode = p;
    }

    public String toString() {
        return name + "\n" + street + "\n" + city + "\n" + state + " " + pincode;
    }
}

class MailList {
    public static void main(String[] args) {

        LinkedList<Address> ml = new LinkedList<Address>();

        ml.add(new Address(
                "Tejas",
                "MG Road",
                "Bangalore",
                "Karnataka",
                "560001"));

        ml.add(new Address(
                "Pranjali",
                "Sixs",
                "Uttarakannada",
                "Karnataka",
                "581301"));

        ml.add(new Address(
                "Sakhi",
                "Malki",
                "Mawsynram",
                "Meghalaya",
                "793106"));

        for (Address element : ml)
            System.out.println(element + "\n");

        System.out.println();
    }
}
