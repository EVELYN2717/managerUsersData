package com.datatools.managerUsersData.service;

import com.datatools.managerUsersData.controller.dto.UserDto;

public interface ICreateUser {
    Boolean createUser(UserDto user);
}
