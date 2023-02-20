package com.users.UserCreation.Service;

import com.users.UserCreation.Entity.User;
import java.util.List;

public interface UserService {

    List<User>getAllUsers();

    User saveUser(User user);

    User getUserById(long id);

    User updateUser(User user, long id);

    void deleteUser(long id);
}
