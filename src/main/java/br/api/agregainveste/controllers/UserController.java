package br.api.agregainveste.controllers;


import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.api.agregainveste.entity.UserEntity;
import br.api.agregainveste.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController{

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

  @PostMapping("/create")
  public ResponseEntity<UserEntity> createUser(@RequestBody CreateUserDto createUserDto){
    var userId = userService.createUser(createUserDto);
    return ResponseEntity.created(URI.create("/user/create" + userId.toString())).build();
  }

  @GetMapping("/user{userId}")
  public ResponseEntity<UserEntity> getByUserId(@PathVariable("userId") String userId){
    return null;
  }

}
