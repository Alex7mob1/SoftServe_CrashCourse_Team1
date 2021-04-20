package com.opencart.repository;

import com.opencart.datamodel.LoginModel;
import com.opencart.datamodel.RegisterModel;
import org.apache.commons.lang3.RandomStringUtils;

public class LoginModelRepository {
    private LoginModelRepository(){}

    public static LoginModel getLoginModel() {
        return LoginModel.getBuilder()
                .adminName("admin")
                .adminPassword("admin")
                .build();
    }
}
