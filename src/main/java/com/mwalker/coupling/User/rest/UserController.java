package com.mwalker.coupling.User.rest;

import com.mwalker.coupling.User.rest.dto.UserResponseDto;
import com.mwalker.coupling.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public UserResponseDto getUsers() {

        return UserResponseDto.fromUserList(
                userService.getAllUsers()
        );
    }

    @GetMapping("/{userId}")
    public boolean canOrder(long userId) {
        return userService.canOrder(userId);
    }
}
