package model;

import org.json.JSONObject;

import java.time.LocalDate;

public class Patient {
    private String firstName, lastName, contact, email, mailingAddress;
    private LocalDate dateOfBirth;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public Patient(String firstName, String lastName, String contact, String email, String mailingAddress, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
        this.email = email;
        this.mailingAddress = mailingAddress;
        this.dateOfBirth = dateOfBirth;
    }

    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("firstName", firstName);
        jsonObject.put("lastName", lastName);
        jsonObject.put("contact", contact);
        jsonObject.put("email", email);
        jsonObject.put("mailingAddress", mailingAddress);
        jsonObject.put("dateOfBirth", dateOfBirth);
        jsonObject.put("age", getAge());

        return jsonObject;
    }
}
