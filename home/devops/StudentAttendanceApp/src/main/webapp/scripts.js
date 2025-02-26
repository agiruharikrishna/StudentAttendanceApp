function validateForm() {
    var name = document.getElementById("studentName").value;
    if (name.trim() === "") {
        alert("Student name cannot be empty!");
        return false;
    }
    return true;
}
