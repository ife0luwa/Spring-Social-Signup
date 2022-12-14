package dev.koorius.SpringOAuth.Entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Wallet extends BaseClass {

    private String uuid = UUID.randomUUID().toString();

    private Long balance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "id" )
    private User user;
}
