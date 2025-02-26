<html>
<head>
    <title>Add Student</title>
    <script src="scripts.js"></script>
</head>
<body>
    <h2>Add Student</h2>
    <form action="addStudent" method="post" onsubmit="return validateForm()">
        <label>Student Name:</label>
        <input type="text" id="studentName" name="name" required>
        <button type="submit">Add Student</button>
    </form>
</body>
</html>
