package com.zpi.userservice.user;
import jdk.jfr.Name;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Password implements Serializable  {

    @Id
    @OneToOne
    @JoinColumn(name = "app_user_id")
    private AppUser app_user;

    @Column(name = "hashed_password")
    private String hashedPassword;





}
