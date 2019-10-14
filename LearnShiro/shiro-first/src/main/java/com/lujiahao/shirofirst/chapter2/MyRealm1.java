package com.lujiahao.shirofirst.chapter2;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * @author lujiahao
 * @date 2019-06-25 18:34
 */
public class MyRealm1 implements Realm {
    @Override
    public String getName() {
        return "myrealm1";
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 获取用户名
        String username = (String) token.getPrincipal();
        // 获取密码
        String password = new String((char[]) token.getCredentials());
        if (!"zhang".equals(username)) {
            // 用户名错误
            throw new UnknownAccountException();
        }
        if (!"123".equals(password)) {
            // 密码错误
            throw new IncorrectCredentialsException();
        }
        return new SimpleAuthenticationInfo(username, password, getName());
    }
}
