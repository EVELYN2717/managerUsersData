package com.datatools.managerUsersData.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    String name;
    String lastName;
    String id;
    String email;
    int gender;
    int hobbie;
    int age;
}
