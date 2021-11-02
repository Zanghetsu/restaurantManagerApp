package com.restaurantmanager.usermanager.appuser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class AppUser {


    @Id
    @SequenceGenerator(name = "app_user_sequence", sequenceName = "app_user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_user_sequence")
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
