package com.datatools.managerUsersData.controller;


import com.datatools.managerUsersData.controller.dto.UserDto;
import com.datatools.managerUsersData.service.ICreateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/datatools")
public class CreateUserController {

    private final ICreateUser createUser;

    @Autowired
    public CreateUserController(ICreateUser createUser) {
        this.createUser = createUser;
    }


    @PostMapping("create-user")
    public ResponseEntity<Boolean> createNewUser(@RequestBody UserDto user){
        return new ResponseEntity<>(createUser.createUser(user), HttpStatus.ACCEPTED);
    }
}
