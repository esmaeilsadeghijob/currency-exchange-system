package com.husha.currencyexchangesystem.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class TokenService {
    private static final String SECRET_KEY = "your-secret-key";

    public static String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1800000)) // 30 دقیقه
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }

    public static Claims decodeToken(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token)
                .getBody();
    }

    public boolean validateToken(String token) {
        try {
            Claims claims = decodeToken(token);
            return claims.getExpiration().after(new Date());
        } catch (ExpiredJwtException e) {
            System.out.println("توکن منقضی شده است.");
        } catch (MalformedJwtException e) {
            System.out.println("توکن نامعتبر است.");
        } catch (UnsupportedJwtException e) {
            System.out.println("توکن پشتیبانی نمی‌شود.");
        } catch (Exception e) {
            System.out.println("خطا در پردازش توکن.");
        }
        return false;
    }
}
