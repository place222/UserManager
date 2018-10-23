package com.ly.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class JwtUser implements UserDetails{

	private String username;
	private String password;
	private Collection<? extends GrantedAuthority> authorities;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自动生成的方法存根
		return authorities;
	}

	public JwtUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super();
		this.username = username;
		this.password = password;
		this.authorities = authorities;
	}

	@JsonIgnore
	@Override
	public String getPassword() {
		// TODO 自动生成的方法存根
		return password;
	}

	@JsonIgnore
	@Override
	public String getUsername() {
		// TODO 自动生成的方法存根
		return password;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO 自动生成的方法存根
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonLocked() {
		// TODO 自动生成的方法存根
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO 自动生成的方法存根
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isEnabled() {
		// TODO 自动生成的方法存根
		return true;
	}

}
