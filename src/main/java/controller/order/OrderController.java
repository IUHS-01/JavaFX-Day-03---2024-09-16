package controller.order;

import db.DBConnection;
import model.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderController {
    public Boolean placeOrder(Order order) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement psTm = connection.prepareStatement("INSERT INTO orders VALUE(?,?,?)");
        psTm.setObject(1,order.getOrderId());
        psTm.setObject(2,order.getOrderDate());
        psTm.setObject(3,order.getCustomerId());
       boolean isOrderAdd = psTm.executeUpdate()>0;
       if (isOrderAdd){
           boolean isOrderDetailAdd = OrderDetailController.addOrderDetail(order.getOrderDetails());

           if (isOrderDetailAdd){

           }
       }

        return true;
    }
}
