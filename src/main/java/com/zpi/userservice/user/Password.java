package com.zpi.userservice.user;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Password implements Serializable  {

    @Id
    @OneToOne()
    @JoinColumn(name = "app_user_id")
    private AppUser appUser;

    @Column(name = "hashed_password")
    private String hashedPassword;

    public Password(String hashedPassword){
        this.hashedPassword = hashedPassword;
    }





}
