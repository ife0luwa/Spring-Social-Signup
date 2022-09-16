package dev.koorius.SpringOAuth.Controller;

import dev.koorius.SpringOAuth.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    private UserService userService;

    @Autowired
    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping ("/oauth2/authorization/google")
    public String socialRegister(OAuth2AuthenticationToken token) {
//        UserDTO userDTO = new UserDTO();
//        Map<String, Object> tokenMap = token.getPrincipal().getAttributes();
//
//        userDTO.setName((String) tokenMap.get("name"));
//        userDTO.setEmail((String) tokenMap.get("email"));
//        System.out.println(userDTO);
//        userService.createUser(userDTO);

        return "Google user successfully";
    }


    @GetMapping("/index")
    public String getIndex () {
        return "index";
    }
}
