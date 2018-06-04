package us.acton.grenville.restdemo.service;

import us.acton.grenville.restdemo.service.user.UserDTO.UserDTO;

public interface UserService {
    UserDTO getUserByUsername(String username);
}
