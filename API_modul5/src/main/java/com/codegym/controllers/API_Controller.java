package com.codegym.controllers;


import com.codegym.models.User_Share;
import com.codegym.services.IUserShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class API_Controller {
    @Autowired
    IUserShareService iUserShareService;

    @GetMapping("api/list")
    public ResponseEntity<List<User_Share>> getListUserShare() {
        List<User_Share> listUserShare = (List<User_Share>) iUserShareService.findAll();
        return new ResponseEntity<>(listUserShare, HttpStatus.OK);
    }

    @PutMapping("api/edit")
    public ResponseEntity<User_Share> editUserShare(@RequestBody User_Share userShare) {
        iUserShareService.save(userShare);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("api/create")
    public ResponseEntity<User_Share> createUserShare(@RequestBody User_Share userShare) {
        iUserShareService.save(userShare);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("api/delete/{id}")
    public ResponseEntity<Void> deleteUserShare(@PathVariable int id) {
        this.iUserShareService.remove((long) id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
