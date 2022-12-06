package com.datatools.managerUsersData.dao;

import com.datatools.managerUsersData.controller.dto.UserDto;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

public interface UserDao {

    @SqlUpdate("INSERT INTO users(name, last_name, id_user, hobbie, gender, email, age)" +
            "VALUES (:name, :lastName, :id, :hobbie, :gender, :email, :age)")
    @RegisterBeanMapper(Boolean.class)
    Boolean createUser(@BindBean UserDto userDto);
}
