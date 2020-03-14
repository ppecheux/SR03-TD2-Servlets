/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pier
 */
public class User {

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIs_male() {
        return is_male;
    }

    public void setIs_male(boolean is_male) {
        this.is_male = is_male;
    }

    @Override
    public String toString() {
        return "User{" + "first_name=" + first_name + ", family_name=" + family_name + ", email=" + email + ", is_male=" + is_male + '}';
    }
    
    private String first_name, family_name, email, password;
    private boolean is_male;

    public User(String first_name, String family_name, String email, String password, boolean is_male) {
        this.first_name = first_name;
        this.family_name = family_name;
        this.email = email;
        this.password = password;
        this.is_male = is_male;
    }
}
