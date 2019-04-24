package com.funtl.oauth2.server.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 功能描述:
 *
 * @author: MR.zt
 * @date: 2019/4/23 21:55
 */
public class PasswordEncoderTests {

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
