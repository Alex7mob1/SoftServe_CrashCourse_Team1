package com.opencart.repository;

import com.opencart.datamodel.LoginModel;

public class LoginModelRepository {
    private LoginModelRepository(){

    }
    public static LoginModel getLoginModel(){
        return LoginModel.getBuilder()
                .email("olena87@gmail.com")
                .password("sergii77")
                .build();
    }
}
