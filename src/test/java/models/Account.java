package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Account {
    String accountName;
    String website;
    String type;
    String phone;
    String description;
    String industry;
    String employees;
    String billingStreet;
    String shippingStreet;
    String billingCity;
    String billingZip;
    String billingState;
    String billingCountry;
    String shippingCity;
    String shippingZip;
    String shippingState;
    String shippingCountry;
}
