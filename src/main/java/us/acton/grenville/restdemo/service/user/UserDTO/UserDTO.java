package us.acton.grenville.restdemo.service.user.UserDTO;

import java.util.Date;

public class UserDTO {
    final private String username;
    final private String password;
    final private int userType;
    final private String email;
    final private String name;
    final private String lastName;
    final private String tel;
    final private Date birthDate;

    UserDTO(String username, String password, int userType, String email,
            String name, String lastName, String tel, Date birthDate) {
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.tel = tel;
        this.birthDate = birthDate;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getUserType() {
        return userType;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTel() {
        return tel;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
