//package com.decagon.rewardyourteacherapi.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomAuthenticationProvider implements AuthenticationProvider {
//
//    private CustomUserDetailService customUserDetailService;
//    private PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public CustomAuthenticationProvider(CustomUserDetailService customUserDetailService, PasswordEncoder passwordEncoder) {
//        this.customUserDetailService = customUserDetailService;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        String username = authentication.getName();
//        String password = authentication.getCredentials().toString();
//        UserDetails user = customUserDetailService.loadUserByUsername(username);
//        return checkPassword(user, password);
//    }
//
//    private Authentication checkPassword(UserDetails user, String password) {
//        if(passwordEncoder.matches(password, user.getPassword())) {
//            return new UsernamePasswordAuthenticationToken(user.getUsername(),
//                    user.getPassword(), user.getAuthorities());
//        } else {
//            throw new BadCredentialsException("Bad credentials");
//        }
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
//    }
//}
