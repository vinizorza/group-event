package com.groupevent.controller;

import com.groupevent.controller.dto.UserCreateDto;
import com.groupevent.mapper.UserMapper;
import com.groupevent.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    public UserController(final UserService userService,
                          final UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    private final UserService userService;

    private final UserMapper userMapper;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> create(@RequestBody UserCreateDto dto) {

        userService.create(userMapper.toUser(dto));

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
