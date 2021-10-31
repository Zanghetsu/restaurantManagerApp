package com.restaurantmanager.usermanager.appuser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AppUser {
    private int id;
    private String firstName;
    private String lastName;
    private String emailAdress;
    private LocalDate dateOfBirth;

    public AppUser(String firstName, String lastName, String emailAdress, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAdress = emailAdress;
        this.dateOfBirth = dateOfBirth;
    }


}
