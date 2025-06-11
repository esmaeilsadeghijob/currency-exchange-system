package com.husha.currencyexchangesystem.repository;

import com.husha.currencyexchangesystem.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RequestRepository extends JpaRepository<Request, Long> {
    List<Request> findByStatus(String status);
}
