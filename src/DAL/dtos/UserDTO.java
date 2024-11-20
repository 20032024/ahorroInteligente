package DAL.dtos;

import java.util.List;

public class UserDTO {
    private Long id;
    private String userName;
    private String pass;
    private List<String> roles;

    public Long getId() {
        return id;
    }
    public String getPass() {
        return pass;
    }
    public String getUserName() {
        return userName;
    }
    public List<String> getRoles() {
        return roles;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
