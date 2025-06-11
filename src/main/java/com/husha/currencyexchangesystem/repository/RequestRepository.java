package com.husha.currencyexchangesystem.repository;

import com.husha.currencyexchangesystem.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
    List<Request> findByStatus(String status);

    Optional<Request> findByUuid(String uuid);
}
