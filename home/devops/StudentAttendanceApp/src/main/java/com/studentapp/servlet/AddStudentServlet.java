package com.studentapp.servlet;
import com.studentapp.dao.StudentDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        if (StudentDAO.addStudent(name)) {
            response.sendRedirect("view_attendance.jsp");
        } else {
            response.getWriter().println("Error adding student.");
        }
    }
}
