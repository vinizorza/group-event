package com.groupevent.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

public class UserCreateDto {
    @Email(message = "Invalid email")
    private String email;
    @Pattern(message = "Invalid password", regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[^\\w\\s]).{8,}$")
    private String password;
    @Pattern(message = "Invalid first name", regexp = "^([A-Z]|[a-z]){1,20}$")
    private String firstName;
    @Pattern(message = "Invalid last name", regexp = "^([A-Z]|[a-z]){1,20}$")
    private String lastName;
    @Pattern(message = "Invalid phone number", regexp = "^[0-9]{8,15}$")
    private String phoneNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
