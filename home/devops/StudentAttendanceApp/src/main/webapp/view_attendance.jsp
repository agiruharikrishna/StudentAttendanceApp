<table>
    <tr><th>ID</th><th>Name</th><th>Attendance</th></tr>
    <% 
        java.sql.ResultSet rs = (java.sql.ResultSet) request.getAttribute("resultSet");
        while (rs.next()) {
    %>
    <tr>
        <td><%= rs.getInt("id") %></td>
        <td><%= rs.getString("name") %></td>
        <td><%= rs.getInt("attendance") %></td>
    </tr>
    <% } %>
</table>
