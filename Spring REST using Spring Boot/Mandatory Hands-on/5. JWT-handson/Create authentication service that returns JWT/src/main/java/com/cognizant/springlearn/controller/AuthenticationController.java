
package com.cognizant.springlearn.controller;

import java.util.*;
import java.util.Base64;
import org.slf4j.*;
import org.springframework.web.bind.annotation.*;
import io.jsonwebtoken.*;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER =
        LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String,String> authenticate(
        @RequestHeader("Authorization") String authHeader){

        LOGGER.info("START authenticate()");
        LOGGER.debug("Authorization Header : {}",authHeader);

        String user=getUser(authHeader);

        Map<String,String> map=new HashMap<>();
        map.put("token",generateJwt(user));

        LOGGER.info("END authenticate()");
        return map;
    }

    private String getUser(String authHeader){
        String encoded=authHeader.substring(6);
        String decoded=new String(Base64.getDecoder().decode(encoded));
        LOGGER.debug("Decoded : {}",decoded);
        return decoded.split(":")[0];
    }

    private String generateJwt(String user){
        JwtBuilder builder=Jwts.builder();
        builder.setSubject(user);
        builder.setIssuedAt(new Date());
        builder.setExpiration(new Date(System.currentTimeMillis()+1200000));
        builder.signWith(SignatureAlgorithm.HS256,"secretkey");
        return builder.compact();
    }
}
