package models;

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

    public Contact(String lastName, String salutation, String firstName, String middleName, String suffix, String accountName, String title, String eMail, String phone, String mobilePhone, String department, String fax, String mailingStreet, String mailingCity, String mailingZip, String mailingState, String mailingCountry) {
        this.lastName = lastName;
        this.salutation = salutation;
        this.firstName = firstName;
        this.middleName = middleName;
        this.suffix = suffix;
        this.accountName = accountName;
        this.title = title;
        this.eMail = eMail;
        this.phone = phone;
        this.mobilePhone = mobilePhone;
        this.department = department;
        this.fax = fax;
        this.mailingStreet = mailingStreet;
        this.mailingCity = mailingCity;
        this.mailingZip = mailingZip;
        this.mailingState = mailingState;
        this.mailingCountry = mailingCountry;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingZip() {
        return mailingZip;
    }

    public void setMailingZip(String mailingZip) {
        this.mailingZip = mailingZip;
    }

    public String getMailingState() {
        return mailingState;
    }

    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }
}
