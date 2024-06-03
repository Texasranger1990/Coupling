package com.mwalker.coupling.rest;

import com.mwalker.coupling.rest.dto.OrderRequestDto;
import com.mwalker.coupling.rest.dto.OrderResponseDto;
import com.mwalker.coupling.rest.dto.UserResponseDto;
import com.mwalker.coupling.service.Order.OrderService;
import com.mwalker.coupling.service.User.UserService;
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
}
