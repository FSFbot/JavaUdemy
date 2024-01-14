package application;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DB;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conn = DB.getConnection();
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            st = (Statement) conn.createStatement();
            rs = ((java.sql.Statement) st).executeQuery("select * from department");

            while (rs.next()) {
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement((java.sql.Statement) st);
            DB.closeConnection();
        }

    }
}
