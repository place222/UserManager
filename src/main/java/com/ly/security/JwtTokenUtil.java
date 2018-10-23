package com.ly.security;

import java.io.Serializable;
import java.sql.Date;
import java.util.Map;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenUtil implements Serializable {

	private final String secret = "aaaaaaa";
	
	
	private String generateToken(Map<String, Object> claims) {
		Date expirationDate = new Date(System.currentTimeMillis()+2592000L * 1000);
		return Jwts.builder().setClaims(claims).setExpiration(expirationDate).signWith(SignatureAlgorithm.HS512,secret).compact(); 
	}
	
	private Claims getClaimsFromToken(String token) {
		Claims claims;
		try {
			claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
		} catch (Exception e) {
			claims = null;
			// TODO: handle exception
		}
		return claims;
	}
	
	
}
