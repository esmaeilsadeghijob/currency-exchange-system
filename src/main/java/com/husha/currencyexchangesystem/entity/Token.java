package com.husha.currencyexchangesystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tokens")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String accessToken;

    private int expiresIn;
    private String tokenType;
}
