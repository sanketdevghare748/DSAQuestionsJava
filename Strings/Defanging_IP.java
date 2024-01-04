package Sanket.Strings;

public class Defanging_IP {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defang(address));
    }
        static String defang (String address)
        {
            return address.replace(".","[.]");
        }
    }
