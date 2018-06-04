package us.acton.grenville.restdemo.service.user.UserDTO;

import us.acton.grenville.restdemo.entity.User;

public class ApiDTOBuilder {
    public static UserDTO userDTOFromUser(User user) {
        return new UserDTO(user.getUsername(), "", user.getUserType(),
                user.getEmail(), user.getName(), user.getLastName(),
                user.getTel(), user.getBornDate());
    }
}
