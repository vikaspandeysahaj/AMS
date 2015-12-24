package com.ams.api.model;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.IOException;

/**
 * Created by vikas on 21/12/15.
 */

@Entity
@Repository
@Table(name="User")
public class AppUser extends Serializable<AppUser> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="FK_CREDENTIAL_ID")
    private Credential credential;

    public AppUser(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }


    @Override
    public String serialize() throws IOException {
        String json = mapper.writeValueAsString(this);
        return json;
    }

    @Override
    public AppUser deserialize(String json) throws IOException {
        AppUser user = mapper.readValue(json, AppUser.class);
        return user;
    }
}
