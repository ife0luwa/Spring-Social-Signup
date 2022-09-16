package dev.koorius.SpringOAuth.Entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student extends User {

    @OneToOne
    @JoinColumn(name = "wallet_id")
    private Wallet wallet;


    @OneToOne
    @JoinColumn(name = "school_id", referencedColumnName = "id")
    private School school;


}
