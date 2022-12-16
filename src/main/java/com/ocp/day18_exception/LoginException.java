package com.ocp.day18_exception;

public class LoginException extends Exception {
    
    public LoginException(String errorMessage) {
        super(errorMessage);
    }
    
    public void how2Do() {
        System.out.println("請重新輸入");
    }
    
}
