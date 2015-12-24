package com.ams.api.repository;

import com.ams.api.model.AppUser;
import com.ams.api.model.Credential;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vikas on 24/12/15.
 */
@Repository
public interface UserDao extends CrudRepository<AppUser, Long> {
    public AppUser findByCredential(Credential credential);
}
