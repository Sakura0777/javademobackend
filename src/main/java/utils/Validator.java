package utils;

public class Validator {
    public static  boolean validatePhone(String phone){
        String regex = "^1[3-9]\\d{9}$";
        return phone.matches(regex);
    }
}
