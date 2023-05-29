package be.lesgoblins.backend.user.bondary;

import be.lesgoblins.backend.user.controller.YggdrasilUserController;
import be.lesgoblins.backend.user.entity.YggdrasilUser;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class YggdrasiUserResource {

    @Autowired
    private YggdrasilUserController yggdrasilUserController;

    @GetMapping("/users")
    public List<YggdrasilUser> getUsers(){
        return yggdrasilUserController.getListOfUser();
    }



}
