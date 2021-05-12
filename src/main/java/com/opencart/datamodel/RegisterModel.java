package com.opencart.datamodel;

import lombok.Getter;

@Getter
public class RegisterModel {
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;

    RegisterModel() {
    }

    public static Builder getBuilder() {
        return new RegisterModel().new Builder();
    }

    public class Builder {
        public Builder firstName(String value) {
            firstName = value;
            return this;
        }

        public Builder lastName(String value) {
            lastName = value;
            return this;
        }

        public Builder email(String value) {
            email = value;
            return this;
        }

        public Builder telephone(String value) {
            telephone = value;
            return this;
        }

        public Builder password(String value) {
            password = value;
            return this;
        }

        public RegisterModel build() {
            return RegisterModel.this;
        }
    }
}




