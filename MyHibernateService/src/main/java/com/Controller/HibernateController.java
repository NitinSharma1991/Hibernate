package com.Controller;

import com.DTO.UserDetails;
import com.DTO.Vechile;
import com.Service.HibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hibernateservice")
public class HibernateController {
    @Autowired
    private HibernateService hibernateService;

    @Autowired
    org.slf4j.Logger log;

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public void addUserDetails(@RequestBody UserDetails userDetails) {
        hibernateService.addUserDetails(userDetails);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user/{userID}/vechile")
    public String addUserDetails(@RequestBody Vechile vechile, @PathVariable int userID) {
        String str;

        UserDetails userDetails = hibernateService.findById(userID);
        if (userDetails !=null) {
            vechile.setUserDetails(userDetails);
            hibernateService.addVechile(vechile);
            str = "Success";
        } else {
            str = "Couldn't find the id in User Table";

        }
        return str;
    }
        @RequestMapping(method = RequestMethod.GET, value = "/user")
    public ResponseEntity<List> getUserDetails(){
           return new ResponseEntity(hibernateService.getUserDetails(),HttpStatus.OK);

    }
}
