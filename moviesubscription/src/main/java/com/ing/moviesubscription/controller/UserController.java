package com.ing.moviesubscription.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ing.moviesubscription.model.ResponseObject;
import com.ing.moviesubscription.model.User;
import com.ing.moviesubscription.service.UserService;
@RestController
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/validateUser", method = RequestMethod.POST)
    public ResponseEntity<ResponseObject> findByUserIdPassword(@RequestBody User user) {
        User userObject = userService.findByUserIdPasswordEmail(user.getEmail(),user.getPassword());
        if (userObject == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
        ResponseObject resObject=new ResponseObject();
        resObject.setStatus("Login Successful");
        resObject.setMessage("Customer is able to login now");
        return new ResponseEntity<>(resObject, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody User user) {

        userService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        }

	

}
