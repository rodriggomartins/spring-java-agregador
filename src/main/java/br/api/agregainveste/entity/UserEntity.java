package br.api.agregainveste.entity;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_users")
public class UserEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID user_id;

    private String username;
    private String email;
    private String passworduser;

    @CreationTimestamp
    private Instant createdAt;
    @UpdateTimestamp
    private Instant updatedAt;


    public UserEntity(){
        
    }
    
    public UserEntity(UUID user_id, String username, String email, String passworduser, Instant createdAt, Instant updatedAt){
        this.user_id = user_id;
        this.username = username;
        this.email = email;
        this.passworduser = passworduser;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUserId(){
        return user_id;
    }

    public void setUserId(UUID user_id){
        this.user_id = user_id;
    }

    public String getUserName(){
        return username;
    }

    public void setUserName(String username){
        this.username = username;
    }

    public Instant getCreated(){
        return createdAt;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return passworduser;
    }

    public void setPassword(String passworduser){
        this.passworduser = passworduser;
    }

    public void setCreated(Instant createdAt){
        this.createdAt = createdAt;
    }

    public Instant getUpdated(){
        return updatedAt;
    }

    public void setUpdated(Instant updatedAt){
        this.updatedAt = updatedAt;
    }
}
