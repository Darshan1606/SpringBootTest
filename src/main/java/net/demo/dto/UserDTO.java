package net.demo.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class UserDTO {

    private String firstName;
    private String lastName;
    @NotNull
    private int age;
    private String email;
    private String password;
    private String city;
    private String course;

}
