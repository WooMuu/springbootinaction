//package com.zjb.chapter3;
//
//import com.zjb.chapter3.repositery.ReaderRepositery;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * Created by zjb on 2019/11/20.
// */
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private ReaderRepositery repositery;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
////        http
////                .authorizeRequests()
////                .antMatchers("/").access("hasRole('READER')")//要求登陆者有READER权限
////                .antMatchers("/**").permitAll();
////                .and()
////
////                .formLogin()
////                .loginPage("/login")//设置登录页面地址
////                .failureUrl("/login?error=true");
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);
////        auth
////                .userDetailsService(new UserDetailsService() {
////                    @Override
////                    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////                        return repositery.getOne(username);
////                    }
////                });
//    }
//}
