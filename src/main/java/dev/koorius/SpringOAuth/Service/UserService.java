package dev.koorius.SpringOAuth.Service;

import dev.koorius.SpringOAuth.Entity.User;
import dev.koorius.SpringOAuth.OAuth.CustomOAuth2User;
import dev.koorius.SpringOAuth.Repository.UserRepo;
import dev.koorius.SpringOAuth.dto.UserDTO;
import dev.koorius.SpringOAuth.enums.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

//    public void processOAuthUser(String email, String name) {
//        User existUser = userRepo.findUserByEmail(email);
//        if(existUser == null) {
//            User newUser = new User();
//            newUser.setName(name);
//            newUser.setEmail(email);
//            newUser.setProvider(Provider.GOOGLE);
//            userRepo.save(newUser);
//        }
//
//    }

    public void processOAuthUser(CustomOAuth2User user) {
        User existUser = userRepo.findUserByEmail(user.getEmail());
        if(existUser == null) {
            User newUser = new User();
            newUser.setName(user.getName());
            newUser.setEmail(user.getEmail());
            newUser.setProvider(Provider.GOOGLE);
            newUser.setPassword(user.getName()); // set user's name as default password
            System.out.println("print: " + newUser);
            userRepo.save(newUser);
        }

    }


    public void createUser(UserDTO user) {
        User existUser = userRepo.findUserByEmail(user.getEmail());
        if(existUser == null) {
            User newUser = new User();
            newUser.setName(user.getName());
            newUser.setEmail(user.getEmail());
            newUser.setProvider(Provider.GOOGLE);
            userRepo.save(newUser);
        }

    }


}
