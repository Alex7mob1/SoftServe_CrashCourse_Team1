package com.opencart.repository;

import com.opencart.datamodel.AddCurrencyModel;
import org.apache.commons.lang3.RandomStringUtils;

public class AddCurrencyModelRepository {

    public AddCurrencyModelRepository() {}

    public static AddCurrencyModel getAddCurrencyModel() {
        return AddCurrencyModel.getBuilder()
                .title(RandomStringUtils.randomAlphabetic(5))
                .code(RandomStringUtils.randomAlphabetic(3))
                .symbolLeft(RandomStringUtils.randomAlphabetic(1))
                .symbolRight("")
                .decimal(RandomStringUtils.random(1))
                .value("1")
                .build();

    }
}
