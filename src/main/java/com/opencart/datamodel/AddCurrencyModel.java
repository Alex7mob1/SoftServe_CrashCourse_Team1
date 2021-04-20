package com.opencart.datamodel;


import lombok.Getter;

@Getter
public class AddCurrencyModel {

    private String title;
    private String code;
    private String symbolLeft;
    private String symbolRight;
    private String decimal;
    private String count;

    AddCurrencyModel(){}

    public static AddCurrencyModel.Builder getBuilder() {
        return new AddCurrencyModel().new Builder();
    }

    public class Builder {
        public AddCurrencyModel.Builder title(String value) {
            title = value;
            return this;
        }

        public AddCurrencyModel.Builder code(String value) {
            code = value;
            return this;
        }

        public AddCurrencyModel.Builder symbolLeft(String value) {
            symbolLeft = value;
            return this;
        }

        public AddCurrencyModel.Builder symbolRight(String value) {
            symbolRight = value;
            return this;
        }

        public AddCurrencyModel.Builder decimal(String value) {
            decimal = value;
            return this;
        }

        public AddCurrencyModel.Builder value(String value) {
            count = value;
            return this;
        }

        public AddCurrencyModel build() {
            return AddCurrencyModel.this;
        }
    }
}
