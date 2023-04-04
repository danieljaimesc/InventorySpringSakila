package com.springsakila.domain.core.contracts.services;


import java.sql.Timestamp;
import java.util.List;

public interface InventoryService<E, K> extends DomainService<E, K> {
    List<E> news(Timestamp date);
}
