package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Contact {
    String lastName;
    String salutation;
    String firstName;
    String middleName;
    String suffix;
    String accountName;
    String title;
    String eMail;
    String phone;
    String mobilePhone;
    String department;
    String fax;
    String mailingStreet;
    String mailingCity;
    String mailingZip;
    String mailingState;
    String mailingCountry;
}
