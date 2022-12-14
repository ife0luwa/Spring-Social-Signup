package dev.koorius.SpringOAuth.Entity;

import dev.koorius.SpringOAuth.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Transaction extends BaseClass {

    private String uuid = UUID.randomUUID().toString();

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "userId" , referencedColumnName = "id")
    private User user;



}
