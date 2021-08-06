package com.leratoletsepe.xpensetrail.resources;

import com.leratoletsepe.xpensetrail.domain.dto.UserDto;
import com.leratoletsepe.xpensetrail.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/user")
public class AuthResource {

    @Autowired
    UserService userService;

    @GetMapping("/auth")
    public ResponseEntity<UserDto> auth(HttpServletRequest request){
        int userId = (Integer) request.getAttribute("userId");

        UserDto user = userService.getUser(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
