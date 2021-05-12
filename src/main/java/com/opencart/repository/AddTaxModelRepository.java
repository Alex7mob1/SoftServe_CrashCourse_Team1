package com.opencart.repository;

import com.opencart.datamodel.AddTaxModel;
import org.apache.commons.lang3.RandomStringUtils;

public class AddTaxModelRepository {

    public AddTaxModelRepository(){}

    public static AddTaxModel getAddTaxModel(){
        return AddTaxModel.getBuilder()
                .nameInput("test")
                .rateInput(RandomStringUtils.randomNumeric(2))
                .build();
    }
}
