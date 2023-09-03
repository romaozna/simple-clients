package com.romaozna.simpleclientsdemo.contacts.model;

public enum ContactType {
    EMAIL,
    PHONE;

    public static ContactType from(String type) {
        for (ContactType value : ContactType.values()) {
            if (value.name().equalsIgnoreCase(type)) {
                return value;
            }
        }
        return null;
    }
}
