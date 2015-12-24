package com.ams.api.service;

import com.ams.api.model.AppUser;
import com.ams.api.model.Credential;
import com.ams.api.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vikas on 21/12/15.
 */

@Service
public class AuthService {

    @Autowired
    UserDao userDao;

    public AppUser authenticate(Credential credential) {
        return userDao.findByCredential(credential);
    }

    public AppUser createUser(AppUser user) {
        return userDao.save(user);
    }
}
