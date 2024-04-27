package br.api.agregainveste.service;

import java.time.Instant;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.api.agregainveste.entity.UserEntity;

import br.api.agregainveste.controllers.CreateUserDto;
import br.api.agregainveste.repository.UserRepository;


@Service
public class UserService{
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void createUser(CreateUserDto createUserDto){
        // conveter DTO para ENTITY
        var entity = new UserEntity(
                UUID.randomUUID(),
                createUserDto.username(),
                createUserDto.email(),
                createUserDto.password(),
                Instant.now(),
                null
                );

        userRepository.save(entity);
    }
}
