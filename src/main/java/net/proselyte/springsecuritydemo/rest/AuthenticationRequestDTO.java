package net.proselyte.springsecuritydemo.rest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthenticationRequestDTO {

    private String email;
    private String password;

}
