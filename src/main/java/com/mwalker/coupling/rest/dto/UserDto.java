package com.mwalker.coupling.rest.dto;

import com.mwalker.coupling.model.User;
import lombok.Data;

@Data
public class UserDto {
    private String userName;

    public static UserDto fromUser(User user) {
        UserDto result = new UserDto();
        result.setUserName(user.getUserName());

        return result;
    }
}
