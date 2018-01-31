package com.startup.bhonsale.rahul.startup.core.repository;

import com.startup.bhonsale.rahul.startup.core.model.SortableEntity;
import com.startup.bhonsale.rahul.startup.core.view.Direction;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.Map;

public interface SortRepository<T extends SortableEntity<ID>, ID extends Serializable> extends CrudRepository<T, ID>
{
    int findMinSortOrder(Specification<T> specification);

    int findMaxSortOrder(Specification<T> specification);

    Map<Integer, T> moveItems(Map<Integer, T> items, Direction direction, Specification<T> specification);

}
