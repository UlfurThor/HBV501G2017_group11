/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ulfur
 */
public class User {

    private String id;

    private String firstName;
    private String lastName;

    private Calendar birthday;

    public User() {

        this.id = "aaa";
        this.firstName = "Bob";
        this.lastName = "Jones";
        
        this.birthday = Calendar.getInstance(Locale.US);
        

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

}
