<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Application Form</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="card shadow">
            <div class="card-header bg-primary text-white text-center">
                <h1>Application Form</h1>
            </div>
            <div class="card-body">
                <form action="application">
                    <div class="form-group">
                        <label for="yourName">Student Name</label>
                        <input type="text" class="form-control" id="yourName" placeholder="Enter Your Name" name="yourName">
                    </div>
                    <div class="form-group">
                        <label for="email">Student Email</label>
                        <input type="email" class="form-control" id="email" placeholder="Enter Your Email" name="email">
                    </div>
                    <div class="form-group">
                        <label for="number">Phone Number</label>
                        <input type="number" class="form-control" id="number" placeholder="##########" name="number">
                    </div>
                    <div class="form-group">
                        <label for="graduation">Graduation</label>
                        <select class="form-control" id="graduation" name="graduation">
                            <option>B.Tech</option>
                            <option>M.Tech</option>
                            <option>MCA</option>
                            <option>BCA</option>
                            <option>BSE</option>
                            <option>B.Com</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="branch">Branch</label>
                        <select class="form-control" id="branch" name="branch">
                            <option>CSE</option>
                            <option>ECE</option>
                            <option>MECHANICAL</option>
                            <option>CIVIL</option>
                            <option>EEE</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="cgpa">CGPA</label>
                        <input type="text" class="form-control" id="cgpa" name="cgpa">
                    </div>
                    <div class="form-group">
                        <label for="skills">Skills</label>
                        <input type="text" class="form-control" id="skills" name="skills">
                    </div>
                    <div class="form-group">
                        <label for="address">Address</label>
                        <input type="text" class="form-control" id="address" name="address">
                    </div>
                    <button type="submit" class="btn btn-success btn-block">Apply</button>
                </form>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
