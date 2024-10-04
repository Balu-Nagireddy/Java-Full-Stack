< page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>  
<body>
<h1>Registration Page</h1>
<form action="register" method="post">
<label>FirstName</label>
<input type="text" name="fn" /> <br><br>

<label>LastName</label>
<input type="text" name="ln" /> <br><br>

<label>Gender</label>
<input type="radio" name="rd" value="Male" />Male 
<input type="radio" name="rd" value="FeMale" />FeMale <br>
<br>

<label>Hobbies</label>
<input type="checkbox" name="ck" value="Music" />Listing to Music 
<input type="checkbox" name="ck" value="Cooking" />Cooking
<input type="checkbox" name="ck" value="Games" />Playing Games  
<input type="checkbox" name="ck" value="Yoga" />Yoga <br>
<br>

<label>City</label>
<select name="ct">
<option>--Select--</option>
<option>Hydrabad</option>
</select>
<input type="submit" value="Register"> 
<input type="reset" value="Reset"> 
</form>



</body>
</html>