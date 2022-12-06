package com.datatools.managerUsersData.service.impl;

import com.datatools.managerUsersData.controller.dto.UserDto;
import com.datatools.managerUsersData.dao.UserDao;
import com.datatools.managerUsersData.service.ICreateUser;
import lombok.extern.slf4j.Slf4j;
import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ICreateUserImpl implements ICreateUser {

    @Autowired
    private Jdbi jdbi;

    @Override
    public Boolean createUser(UserDto user) {
        return jdbi.withExtension(UserDao.class, dao -> dao.createUser(user));
    }
}
