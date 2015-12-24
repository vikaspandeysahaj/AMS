package com.ams.api.controller;

import com.ams.api.model.AppUser;
import com.ams.api.model.Credential;
import com.ams.api.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * Created by vikas on 21/12/15.
 */
@RestController
public class AuthController {

    @Autowired
    AuthService authService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody Credential credential) throws IOException {
        AppUser createdUser = authService.authenticate(credential);
        return createdUser.serialize();

    }

    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    @ResponseBody
    public String createUser(@RequestBody AppUser user) throws IOException {
        AppUser createdUser = authService.createUser(user);
        return createdUser.serialize();
    }


}
