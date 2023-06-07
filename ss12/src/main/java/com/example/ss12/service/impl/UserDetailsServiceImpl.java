package com.example.ss12.service.impl;

import com.example.ss12.model.AppUser;
import com.example.ss12.model.UserRole;
import com.example.ss12.repository.IAppUserRepo;
import com.example.ss12.repository.IUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private IAppUserRepo appUserRepository;
    @Autowired
    private IUserRole iUserRole;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        //Tìm đối tượng đang đăng nhập trong DB
        AppUser appUser = this.appUserRepository.findByUserName(userName);

        if (appUser == null) {
            System.out.println("User not found! " + userName);
            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
        }

        System.out.println("Found User: " + appUser);


        List<GrantedAuthority> grantList = new ArrayList<>();
        List<UserRole> userRoles = iUserRole.findByAppUser(appUser);
        if (userRoles != null) {
            for (UserRole userRole : userRoles) {
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(userRole.getAppRole().getRoleName());
                grantList.add(authority);
            }
        }

        UserDetails userDetails = new User(appUser.getUserName(),
                appUser.getEncrytedPassword(), grantList);

        return userDetails;
    }
}
