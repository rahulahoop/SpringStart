package com.startup.bhonsale.rahul.startup.core.utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;

public class XmlLocalDateAdapter extends XmlAdapter<String, LocalDate> {

    @Override
    public LocalDate unmarshal(String value) throws Exception {
        return LocalDate.parse(value);
    }

    @Override
    public String marshal(LocalDate value) throws Exception {
        if (value == null)
            return String.valueOf(LocalDate.of(1970, 1 ,1));
        return String.valueOf(value);
    }
}
