package com.startup.bhonsale.rahul.startup.core.repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public interface SpareEntityRepository<T, ID extends Serializable> extends CrudRepository<T, ID>
{
    List<Long> findAllWithIdsOnly(Specification<T> specification);
}
