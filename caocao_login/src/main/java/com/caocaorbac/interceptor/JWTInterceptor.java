package com.caocaorbac.interceptor;


import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.caocaorbac.utils.JWTUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

//get token from request header and verify
public class JWTInterceptor implements HandlerInterceptor {
    Map<String,Object> map = new HashMap<>();

    @Override
    public boolean preHandle (HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
    //get token from header
        String token = request.getHeader("token");
        try{
            JWTUtils.verify(token);
            return true;
        } catch (SignatureVerificationException e) {
            e.printStackTrace();
            map.put("msg", "Invalid signature");
        } catch (TokenExpiredException e){
            e.printStackTrace();;
            map.put("mag","Token expired");
        } catch (Exception e){
            e.printStackTrace();
            map.put("msg","invalid token");
        }
        map.put("state",false);

        //convert map to json
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(map);
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().println(json);
        return false;
    }
}
