package com.ocp.day18_exception;

import java.util.LinkedHashMap;
import java.util.Map;

public class LoginDemo {
    private static Map<String, String> users;
    static {
        users = new LinkedHashMap<>();
        users.put("A01", "1234");
        users.put("B02", "5678");
    }
    public static void main(String[] args) {
        
        
    }
    
    public static boolean checkLogin(String username, String password) throws LoginException {
        String pwd = users.get(username);
        if(pwd == null) {
            throw new LoginException("帳號錯誤");
        }
        if(!pwd.equals(password)) {
            throw new LoginException("密碼錯誤");
        }
        //-------------------------------------
        return true;
    }
}
