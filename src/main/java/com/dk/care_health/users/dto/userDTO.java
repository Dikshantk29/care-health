package com.dk.care_health.users.dto;

import com.dk.care_health.role.entity.Role;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder  //Allows creating objects using Builder Pattern.
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true) //JSON serialization and deserialization.-If API receives extra fields, they will be ignored.
@JsonInclude(JsonInclude.Include.NON_NULL) //If a field is null, it will not appear in JSON response.
public class userDTO {

    private Long id;

    private String name;

    private String email;

    private String profilePictureUrl;

    @JsonInclude //Usually password is not returned in response for security
    private String password;

    private List<Role> roles;

}
