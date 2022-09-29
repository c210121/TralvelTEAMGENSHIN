package com.example.travelvn.Model.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private long id;
    private String first_name;
    private String last_name;
    private String email;
    private String name_role;
    private String avatar_url;
}
