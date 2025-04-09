package com.xworkz.passport.generatepassport;

import com.xworkz.passport.passport.PassportDto;

public class PassportSeva {
    public PassportDto dto;

    public boolean registeruser(PassportDto passportdto) {
        boolean isUserRegistered = false;


        boolean userValidated = validateUser(passportdto);
        if (userValidated == true) {
            isUserRegistered = true;
            System.out.println("Registered is completed");
            dto=passportdto;
        }
        else
            System.out.println("use is not registered...try again later");
        return isUserRegistered;

    }

    public boolean validateUser(PassportDto passportdto) {
        boolean isvalidateUser = false;
        boolean isDcbvalid = false;
        boolean isCpvLocationValid = false;
        boolean isGivennameValid = false;
        boolean isSurenameValid = false;
        boolean isDobValid = false;
        boolean isEmailValid = false;
        boolean isEmailissameValid = false;
        boolean isLoginidValid = false;
        boolean isPasswordValid = false;
        boolean isHintquesValid = false;
        boolean isHintansValid = false;
        boolean isCaptchaValid = false;

        if (passportdto.getDcd() != null && !passportdto.getDcd().toString().isEmpty()) {
            isDcbvalid = true;
        }
        else
            System.out.println(" dcd is invalid");

        if (passportdto.getCpvlocation() != null && !passportdto.getCpvlocation().toString().isEmpty()) {
            isCpvLocationValid = true;
        }
        else
            System.out.println(" Cpvlocation is invalid");

        if (passportdto.getGivenname() != null && !passportdto.getGivenname().isEmpty()) {
            isGivennameValid = true;
        }
        else
            System.out.println(" given name is invalid");

        if (passportdto.getSurename() != null && !passportdto.getSurename().isEmpty()) {
            isSurenameValid = true;
        }
        else
            System.out.println(" sure name  is invalid");

        if (passportdto.getDob() != null && !passportdto.getSurename().isEmpty()) {
            isDobValid = true;
        }
        else
            System.out.println(" dob  is invalid");

        if (passportdto.getEmail() != null && !passportdto.getEmail().isEmpty()) {
            isEmailValid = true;
        }
        else
            System.out.println(" email is invalid");

        if (passportdto.getEmailissame() != null  ) {
            isEmailissameValid = true;
        }
        else
            System.out.println(" email  is invalid");

        if (passportdto.getLoginid() != null && !passportdto.getLoginid().isEmpty()) {
            isLoginidValid = true;
        }
        else
            System.out.println(" log in id  is invalid");

        if (passportdto.getPassword() != null && !passportdto.getPassword().isEmpty()) {
            isPasswordValid = true;
        }

        else
            System.out.println(" password  is invalid");

        if (passportdto.getHintques() != null && !passportdto.getHintques().isEmpty()) {
            isHintquesValid = true;
        }
        else
            System.out.println(" hintques is invalid");

        if (passportdto.getHintans() != null && !passportdto.getHintans().isEmpty()) {
            isHintansValid = true;
        }
        else
            System.out.println(" hintans is invalid");

        if (passportdto.getCaptcha() != null && !passportdto.getCaptcha().isEmpty()) {
            isCaptchaValid = true;
        }
        else
            System.out.println(" captcha is invalid");

        if (isDcbvalid && isCpvLocationValid && isGivennameValid && isSurenameValid && isDobValid && isEmailValid && isEmailissameValid && isLoginidValid && isPasswordValid && isHintquesValid && isHintansValid && isCaptchaValid)
        {
            isvalidateUser=true;
        }

        return isvalidateUser;

    }
    public void userDetails(){
        System.out.println(" the dcb location is="+dto.getDcd());
        System.out.println(" the cpv location is="+dto.getCpvlocation());
        System.out.println(" the name  is="+dto.getGivenname());
        System.out.println(" the sure name is="+dto.getSurename());
        System.out.println(" the dob  is="+dto.getDob());
        System.out.println(" the email is="+dto.getEmail());
        System.out.println(" the email is same is="+dto.getEmailissame());
        System.out.println(" the login is="+dto.getLoginid());
        System.out.println(" the password is="+dto.getPassword());
        System.out.println(" the hintques is="+dto.getHintques());
        System.out.println(" the hintans is="+dto.getHintans());
        System.out.println(" the captcha is="+dto.getCaptcha());
    }
}
