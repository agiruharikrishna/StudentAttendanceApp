package com.studentapp.servlet;
import com.studentapp.dao.StudentDAO;
import java.io.IOException;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewAttendance")
public class ViewAttendanceServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ResultSet rs = StudentDAO.getAttendance();
        request.setAttribute("resultSet", rs);
        request.getRequestDispatcher("view_attendance.jsp").forward(request, response);
    }
}
