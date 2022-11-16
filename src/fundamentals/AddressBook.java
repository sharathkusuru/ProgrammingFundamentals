package fundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBook {
    public static  void main(String[]args){
        List<Contact> al = Arrays.asList(new Contact("sharath","reddy","9703627254"),
                                        (new Contact("varun","reddy","7794809167")),
                                        (new Contact("raghu","anupati","8886528829")));
                 al.stream()
                .filter(contact -> contact.getFirstName() == "raghu")
                .forEach(contact -> System.out.println(contact.getPhoneNumber()));
    }
}


