package com.startup.bhonsale.rahul.startup.core.utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;

public class XmlLocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {
    @Override
    public LocalDateTime unmarshal(String value) throws Exception {
        return LocalDateTime.parse(value);
    }

    @Override
    public String marshal(LocalDateTime value) throws Exception {
        if (value == null) return null;

        return String.valueOf(value);
    }
}
