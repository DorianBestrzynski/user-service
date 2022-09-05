package com.zpi.userservice.user;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
           )
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence", allocationSize = 10)
    @Column(unique = true, nullable = false)
    private Long userId;

    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Column(name = "email", nullable = false, unique = true ,length = 150)
    private String email;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "surname", length = 50)
    private String surname;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "registration_date", nullable = false)
    private LocalDateTime registrationDate;

    @OneToOne(cascade=CascadeType.PERSIST, mappedBy = "app_user")
    private Password password;

    public AppUser(String username, String email, String firstName, String surname, LocalDate birthday, LocalDateTime registrationDate, Password password){
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.surname = surname;
        this.birthday = birthday;
        this.registrationDate = registrationDate;
        this.password = password;
    }


    //TODO Co zrobić z Encją User_Group




}
