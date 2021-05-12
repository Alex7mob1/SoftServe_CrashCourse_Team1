package com.opencart.repository;

import com.opencart.datamodel.AddCurrencyModel;
import org.apache.commons.lang3.RandomStringUtils;

public class EditCurrencyModelRepository {

    public static AddCurrencyModel getEditCurrencyModel(){
        return AddCurrencyModel.getBuilder()
                .code("GBR")
                .value("24")
                .build();
    }
}
