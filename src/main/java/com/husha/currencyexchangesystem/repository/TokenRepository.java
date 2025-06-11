package com.husha.currencyexchangesystem.repository;

import com.husha.currencyexchangesystem.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Optional<Token> findByAccessToken(String accessToken);
}
