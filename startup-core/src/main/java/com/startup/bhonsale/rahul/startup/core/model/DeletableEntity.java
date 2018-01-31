package com.startup.bhonsale.rahul.startup.core.model;

import java.io.Serializable;

public interface DeletableEntity<ID extends Serializable> extends IdEntity<ID>
{
    String DELETED = "deleted";

    boolean isDeleted();

    void setDeleted(boolean deleted);
}
