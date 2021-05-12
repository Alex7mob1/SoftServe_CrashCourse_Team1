package com.opencart.datamodel;

import lombok.Getter;

@Getter
public class LoginModel {
    private String adminName;
    private String adminPassword;

    LoginModel(){}

    public static LoginModel.Builder getBuilder() {
        return new LoginModel().new Builder();
    }

    public class Builder{

        public LoginModel.Builder adminName(String value) {
            adminName = value;
            return this;
        }

        public LoginModel.Builder adminPassword(String value) {
            adminPassword = value;
            return this;
        }

        public LoginModel build() {
            return LoginModel.this;
        }

    }
}
