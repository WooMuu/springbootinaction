//package com.zjb.chapter3.entity;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import javax.persistence.Entity;
//import java.util.Arrays;
//import java.util.Collection;
//
///**
// * Created by zjb on 2019/11/20.
// */
//@Entity
//public class Reader implements UserDetails {
//
//    private static final long serialVersionUID = 0L;
//    @javax.persistence.Id
//    private String username;
//    private String password;
//    private String fullname;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Arrays.asList(new SimpleGrantedAuthority("READER"));//授予READER权限
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    //不过期
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    //不加锁
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getFullname() {
//        return fullname;
//    }
//
//    public void setFullname(String fullname) {
//        this.fullname = fullname;
//    }
//}
