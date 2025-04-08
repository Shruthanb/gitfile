package com.xworkz.snapchatapp.dto;
public class SnapchatDto {
    private String userName;
    private String mobileNo;
    private String email;
    private String dob;
    private String password;
    private String confirmPassword;
    private String displayName;

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getMobileNo() {
        return mobileNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getDob() {
        return dob;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getDisplayName() {
        return displayName;
    }
}
