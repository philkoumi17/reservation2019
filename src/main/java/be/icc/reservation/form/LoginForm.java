package be.icc.reservation.form;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by Scohier Dorian on 26-04-19.
 */
public class LoginForm {

    @NotBlank(message = "Ce champ ne peut pas rester vide")
    private String userName;

    @NotBlank(message = "Ce champ ne peut pas rester vide")
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}