package com.opencart.enums;

public enum URLs {

    BASE_URL("http://localhost/opencart/upload/index.php?route=common/home"),
    ADMIN_CURRENCY_URL("http://localhost/opencart/upload/admin/index.php?route=localisation/currency&user_token=9JXyzQv7JOvmaw8rP1uKWuGjaQsv0YiU"),
    TAX_RATES_URL("http://localhost/opencart/upload/admin/index.php?route=localisation/tax_rate&user_token=UcdzwyLoGyOHNZGtRgLpvfFo45R2wSnm"),
    TAX_CLASSES_URL("http://localhost/opencart/upload/admin/index.php?route=localisation/tax_class&user_token=yD34zhhqrAZr7W9YANxAL5RHy1IsX2S4");
    private final String value;

    URLs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
