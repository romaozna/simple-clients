package com.romaozna.simpleclientsdemo.contacts.model;

import com.romaozna.simpleclientsdemo.exception.BadRequestException;

public enum ContactType {
    EMAIL,
    PHONE;

    public static ContactType from(String type) {
        for (ContactType value : ContactType.values()) {
            if (value.name().equalsIgnoreCase(type)) {
                return value;
            }
        }
        throw new BadRequestException("Unknown contact type");
    }
}
