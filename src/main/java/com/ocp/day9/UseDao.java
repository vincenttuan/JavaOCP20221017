package com.ocp.day9;

public class UseDao {
    public static void main(String[] args) {
        Dao d1 = new Dao();
        Dao d2 = new Dao();
        System.out.println(d1);
        System.out.println(d2);
        
        DaoSingle ds1 = DaoSingle.getInstance();
        DaoSingle ds2 = DaoSingle.getInstance();
        System.out.println(ds1);
        System.out.println(ds2);
    }
}
