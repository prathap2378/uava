<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Event</title>
</head>

<body id="body" style="overflow:hidden;">

<!-- Contact Us Form -->
<form method="Post" action="#" id="form"  name="form">
<table>
<!-- <img id="close" src="../images/rsz_1rsz_event.jpg" onclick ="div_hide()"> -->
<tr>
<td>
<P title="Add Event">Add Event</P>
</td>
</tr>
</table>

<table>
<tr>
<td align="right">
Add Event:
</td><td><input id="name" name="name" value="Add Event" type="text" maxlength="150" required>
</td></tr>
<tr>
<td align="right">
Location:</td>
<td><input id="location" name="location" value="Location" type="text" maxlength="150" required>
</td>
</tr>
</table>

<table width="100%">
<tr >
<td width="50%" align="left">
<div class=""  width="50%">Start Date:</div>
<div width="50%"><input id="time" name="time" value="Time" type="date" width="100%" required></div>
</td>
<td width="50%">
<div class="" align="left" width="50%">End Date:</div>
<div align="left"  width="50%"><input id="time" name="time" value="Time" type="date" required></div>
</td>
</tr>
</table>

<table width="100%">
<tr>
<td align="right">
Satrt Time:</td>
<td><input id="time" name="time" value="Time" required>
</td>
<td align="right">
<select>
<option>AM</option>
<option>PM</option></select>
</td>
<td align="right">
End Time:</td>
<td><input id="time" name="time" value="Time" required>
</td><td align="right">
<select>
<option>AM</option>
<option>PM</option></select>
</td>
</tr>
</table>

<table>
<tr>
<td align="right">
Description:</td>
<td><textarea id="msg" name="message"></textarea>
</td>
</tr>
</table>

<table>
<tr>
<td>
<button type="submit" id="addEventbtn" Value="Add Event">Add E</button>
</td></tr>
</table>

<img id="close" src="images/event.png"/>
</form>
</body>
</html>