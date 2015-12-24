package com.ams.api.model;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.IOException;

/**
 * Created by vikas on 22/12/15.
 */

@Entity
@Table(name = "CREDENTIAL")
@Repository
public class Credential extends Serializable<AppUser> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CREDENTIAL_ID")
    private int id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "PASSWORD")
    private String password;

    public Credential(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
