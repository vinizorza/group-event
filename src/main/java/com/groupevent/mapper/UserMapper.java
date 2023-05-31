package com.groupevent.mapper;

import com.groupevent.controller.dto.UserCreateDto;
import com.groupevent.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(UserCreateDto dto);
}
