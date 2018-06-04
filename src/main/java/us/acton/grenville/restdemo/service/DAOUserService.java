package us.acton.grenville.restdemo.service;

import us.acton.grenville.restdemo.data.dao.UserDao;
import us.acton.grenville.restdemo.data.entity.User;
import us.acton.grenville.restdemo.service.user.UserDTO.ApiDTOBuilder;
import us.acton.grenville.restdemo.service.user.UserDTO.UserDTO;

public class DAOUserService implements UserService {

    final private UserDao userDao;

    public DAOUserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserDTO getUserByUsername(String username) {
        final User user = userDao.getUser(username);

        return ApiDTOBuilder.userDTOFromUser(user);
    }
}
