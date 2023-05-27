package be.lesgoblins.backend.user.controller;

import be.lesgoblins.backend.user.entity.YggdrasilUser;
import be.lesgoblins.backend.user.repository.YggdrasilUserRepository;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class YggdrasilUserController {

    @Autowired
    private YggdrasilUserRepository yggdrasilUserRepository;

    public void addNewUser(YggdrasilUser yggdrasilUser){
        yggdrasilUserRepository.save(yggdrasilUser);
    }


    public List<YggdrasilUser> getListOfUser(){
        return yggdrasilUserRepository.findAll();
    }
}
