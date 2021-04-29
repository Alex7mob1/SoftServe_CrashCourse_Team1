package com.opencart.datamodel;

import lombok.Getter;

    @Getter
    public class EditAccountModel {
        private String firstName;
        private String lastName;
        private String email;
        private String telephone;

        EditAccountModel() {
        }

        public static Builder getBuilder() {
            return new EditAccountModel().new Builder();
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

            public EditAccountModel build() {
                return EditAccountModel.this;
            }
        }
    }


