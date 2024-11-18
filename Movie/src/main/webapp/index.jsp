<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Ticket Booking</title>
<!-- Add Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
    body {
        background-color: #f8f9fa; /* Light gray background */
    }
    .container {
        background-color: #ffffff; /* White form background */
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    }
    h1 {
        color: #007bff; /* Bootstrap primary color */
    }
    button {
        background-color: #28a745; /* Bootstrap success color */
    }
    button:hover {
        background-color: #218838;
    }
</style>
</head>
<body>
<div class="container mt-5">
    <h1 class="text-center mb-4">Online Ticket Booking</h1>

    <form action="MovieServlet" method="post">
        <div class="mb-3">
            <label for="id" class="form-label">Movie ID</label>
            <input type="text" class="form-control" id="id" name="id" required>
        </div>
        <div class="mb-3">
            <label for="MovieName" class="form-label">Movie Name</label>
            <input type="text" class="form-control" id="MovieName" name="MovieName" required>
        </div>
        <div class="mb-3">
            <label for="theatreName" class="form-label">Theatre Name</label>
            <input type="text" class="form-control" id="theatreName" name="theatreName" required>
        </div>
        <div class="mb-3">
            <label for="ticketPrice" class="form-label">Ticket Price</label>
            <input type="text" class="form-control" id="ticketPrice" name="ticketPrice" required>
        </div>
        <div class="mb-3">
            <label for="NoOfTickets" class="form-label">Number of Tickets</label>
            <input type="text" class="form-control" id="NoOfTickets" name="NoOfTickets" required>
        </div>
        <button type="submit" class="btn btn-success w-100">Book</button>
    </form>
</div>

<!-- Add Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
