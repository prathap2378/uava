<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.sun.xml.internal.txw2.Document"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="main.css" rel="stylesheet" type="text/css">
<title>Welcome to Mela</title>
</head>

<body onload="outPut()">

<form name='feeds' action="#" >

<!-- action="Process.jsp" -->
<table style="padding-top: 30px" id="header" width="100%">
  <tr >
    <td width="50%" >
     <!-- id='header' -->
    <div  align="left">
	<p >Welcome to Mela</p>
	</div></td>
    <th width="50%">

    <div style="padding-top: 5px">
	<button onclick="document.forms[0].action = 'AddEvent.jsp'; return true;">Add Event</button>

	</div>
    <div align="left">
	<p id='time'></p>
	</div>

  </tr>
  <!-- <tr>
  <th>
	<input type="button" onclick="switchJS()" value="Today is"/>
	<p id='today'>Today is</p>
	</th>
  </tr> -->


<tr>
</tr>
	<tr>
	<td  align="center">Location:<input type="text" id="location_event" name="location_event"/></td>
	<td  align="center">Date:<input type="date" id="date_event" name="date_event"/></td>
	<td  align="right">Search:<input type="text" id="search_event" name="search_event" size="100%" value="search here"/></td>
	</tr>
  <tr>
    <th align="center" width="50%">
    <div align="center">
    </div>
    </th>
    <th width="50%">
    <div align="center">
    <div id="namsteText" align="center">Namaste!</div>
    </div>
    </th>
  </tr>
</table>

<script src="main.js" type="text/javascript">

</script> 

</form>
</body>
</html>

