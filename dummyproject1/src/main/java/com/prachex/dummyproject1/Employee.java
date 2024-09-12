package com.prachex.dummyproject1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee 
{
    private String name;
    private String phone;
    private String email;


    //since these variables are private
    // we will need to use getter and setter methods 
    /**public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }public String getPhone() {
        return phone;
    }public void setPhone(String phone) {
        this.phone = phone;
    }**/


}
