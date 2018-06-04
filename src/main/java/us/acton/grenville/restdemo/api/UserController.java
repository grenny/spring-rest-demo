package us.acton.grenville.restdemo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import us.acton.grenville.restdemo.service.UserService;
import us.acton.grenville.restdemo.service.user.UserDTO.UserDTO;

@RestController
@RequestMapping("/api/user")
@CrossOrigin()
public class UserController {

    @Autowired
    final private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "{username}/login", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<UserDTO> login(@PathVariable String username) {
        final UserDTO userDTO = userService.getUserByUsername(username);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }
}
