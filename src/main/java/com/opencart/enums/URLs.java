package com.opencart.enums;

public enum URLs {

    BASE_URL("http://localhost/opencart/upload/index.php?route=common/home"),
    ADMIN_CURRENCY_URL("http://localhost/opencart/upload/admin/index.php?route=localisation/currency&user_token=9JXyzQv7JOvmaw8rP1uKWuGjaQsv0YiU");


    private final String value;

    URLs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
