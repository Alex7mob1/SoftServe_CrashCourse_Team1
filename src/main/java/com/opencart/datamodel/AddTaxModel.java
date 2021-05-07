package com.opencart.datamodel;

import lombok.Getter;

@Getter
public class AddTaxModel {
    private String nameInput;
    private String  rateInput;

    AddTaxModel(){}

    public static AddTaxModel.Builder getBuilder(){return new AddTaxModel().new Builder();}

    public class Builder{

        public AddTaxModel.Builder nameInput(String value){
            nameInput = value;
            return this;
        }

        public AddTaxModel.Builder rateInput(String value){
            rateInput = value;
            return this;
        }

        public AddTaxModel build() {
            return AddTaxModel.this;
        }

    }


}
