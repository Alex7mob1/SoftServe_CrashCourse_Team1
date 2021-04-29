package com.opencart.repository;

import com.opencart.datamodel.EditAccountModel;
import org.apache.commons.lang3.RandomStringUtils;

public class EditAccountModelRepository {
        private EditAccountModelRepository(){

        }
        public static EditAccountModel getEditAccountModel(){
            return EditAccountModel.getBuilder()
                    .firstName("")
                    .lastName(RandomStringUtils.randomAlphabetic(33))
                    .email(RandomStringUtils.randomAlphabetic(5) + "@gmail")
                    .telephone(RandomStringUtils.randomAlphabetic(2))
                    .build();
        }
    }

