package fundamentals.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    public  static void main(String[]args){
            String email = "sharath@gmail.com";
            String regex = "^(.+)@(.+)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " : " + matcher.matches() + "\n");
        }
}
