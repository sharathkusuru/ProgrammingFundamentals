package fundamentals.email;

import java.util.regex.Pattern;

public class Email {
    private static boolean isvalid(String email){
        String regex = "^(.+)@(.+)$";
           Pattern pattern = Pattern.compile(regex);
           if(email ==null)
               return false;
           return pattern.matcher(email).matches();
//          Matcher matcher = pattern.matcher(email);

    }

    public  static void main(String[]args) {
            String email = "sharath@gmail.com";
        if(isvalid(email)){
            System.out.println(email + ": true");
        }
        else {
            System.out.println("false");
        }
    }
}
