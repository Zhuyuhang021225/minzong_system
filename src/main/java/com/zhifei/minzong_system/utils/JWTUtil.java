package com.zhifei.minzong_system.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.zhifei.minzong_system.entity.User;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月21日 11:27
 */
public class JWTUtil{

    public static String getToken(User user){
        JWTCreator.Builder builder = JWT.create();
        String token = builder.withClaim("loginName", user.getName())
                .withClaim("password", user.getPassword())
                .withClaim("id", user.getId())
                .sign(Algorithm.HMAC256("minzong_system"));
        return token;
    }

    public static DecodedJWT decode(String token){
        JWTVerifier ks = JWT.require(Algorithm.HMAC256("minzong_system")).build();
        return ks.verify(token);
    }
}
