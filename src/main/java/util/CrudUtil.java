package util;

import db.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class CrudUtil {
    public static <T>T execute(String sql,Object... args) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
    }



    public void sum(Integer... numbers){
        for (int i =0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }


    CrudUtil(){
        sum(10,10,20,30,60,50,40,80,90,90,100,101,102,103,106,105);
        sum(10,10,20,30,60,50,40,80,90,90,100,101,102,103,106,105,200,50,30,60,50,0,80,80);
    }
}
