package com.ocp.day22_thread;

public class MyConnTest {
    public static void main(String[] args) {
        
        try(MyConn myConn = new MyConn()) {
            
            myConn.printData();
            
        } catch(Exception e) {
            System.out.println(e);
        }
        
    }
}
