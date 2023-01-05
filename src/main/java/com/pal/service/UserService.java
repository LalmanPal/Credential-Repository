package com.pal.service;

import java.util.List;

import com.pal.entity.User;
import com.pal.model.UserDto;

public interface UserService {

	void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
