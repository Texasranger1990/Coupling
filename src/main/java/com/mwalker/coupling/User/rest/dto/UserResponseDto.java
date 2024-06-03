package com.mwalker.coupling.User.rest.dto;

import com.mwalker.coupling.User.model.User;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class UserResponseDto {
    private List<UserDto> users;

    public static UserResponseDto fromUserList(List<User> users) {
        UserResponseDto result = new UserResponseDto();
        result.setUsers(users.stream().map(UserDto::fromUser).collect(Collectors.toList()));

        return result;
    }
}
