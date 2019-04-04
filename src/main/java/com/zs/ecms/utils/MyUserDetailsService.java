package com.zs.ecms.utils;

import com.zs.ecms.pojo.fck.User;
import com.zs.ecms.service.fck.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserService us;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//        User user = us.getUserByName(username);
//        if (null == user) {
//                        throw new UsernameNotFoundException(username);
//                    }
//                 List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//                for (SysRole role : sysUser.getRoleList()) {
//                         for (SysPermission permission : role.getPermissionList()) {
//                                 authorities.add(new SimpleGrantedAuthority(permission.getCode()));
//                             }
//                     }
//
//                 return new User(sysUser.getUsername(), sysUser.getPassword(), authorities);
        return null;
//
    }

}
