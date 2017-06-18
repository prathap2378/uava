<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Event</title>
</head>

<body id="body" style="overflow:hidden;">
<div id="abc">

<!-- Popup Div Starts Here -->
<div id="popupContact">

<!-- Contact Us Form -->
<form method="Post" action="/MelaPractice/Register" id="form"  name="form">
<img id="close" src="images/3.png" onclick ="div_hide()">
<h2>Add Event</h2>
<hr>
<input id="name" name="name" value="Add Event" type="text">
<input id="email" name="email" value="Location" type="text">
<input id="time" name="time" value="Time" type="text">
<textarea id="msg" name="message"></textarea>
<input type="submit" id="addEventbtn" Value="Add Event"/>
</form>
</div>
<!-- Popup Div Ends Here -->
</div>
</body>
<!-- Body Ends Here -->
</body>
</html>