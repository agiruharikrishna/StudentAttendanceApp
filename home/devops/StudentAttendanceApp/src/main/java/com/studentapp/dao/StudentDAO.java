package com.studentapp.dao;
import com.studentapp.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {
    public static boolean addStudent(String name) {
        try (Connection conn = DBConnection.getConnection()) {
            String query = "INSERT INTO students (name) VALUES (?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static ResultSet getAttendance() {
        try {
            Connection conn = DBConnection.getConnection();
            String query = "SELECT * FROM students";
            return conn.createStatement().executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
