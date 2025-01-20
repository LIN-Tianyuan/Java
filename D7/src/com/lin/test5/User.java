package com.lin.test5;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class User {
    // Properties
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    public User() {
    }

    public User(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    /**
     * Get
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Set
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Get
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


    // Shortcuts:
    // alt + insert
    // alt + Fn + insert


    // Plugin PTG 1 second to generate standard Javabean
}
