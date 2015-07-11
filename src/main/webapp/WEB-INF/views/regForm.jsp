<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
</head>
<body>
<div align="center" id="patientEnrollment">
		<h3>Patient Enrollment</h3>
		<form action="/hack/registerPatient" method="post">
			<table>
				<tr>
					<td colspan="1">First Name<b style="color: red">*</b><td>
					<td colspan="1"><input type="text" id="patFname" /></td>
					 
					<td colspan="1">Last Name <b style="color: red">*</b><td>
					<td colspan="1"><input type="text" id="patLname" /></td>
 				</tr>
				<tr>
					<td>DOB <b style="color: red">*</b><td>
					<td><input type="text" id="patdob" /></td>
 					<td>Email<td>
					<td><input type="text" id="patEmail"></td>
				</tr>
				<tr>
					<td>Mobile<b style="color: red">*</b><td>
					<td><input type="text" id="patdob" /></td>
					<td>Aadhar#<td>
					<td><input type="text" id="patpin" /></td>
				</tr>
				<tr>
					<td>Password<b style="color: red">*</b><td>
					<td><input type="password" id="patadd1" /> </td>
					<td>Confirm Password<b style="color: red">*</b><td>
					<td><input type="password" id="patadd2" /></td>
				</tr>
				<tr><input type="submit" value="Register" /></tr>
 			</table>
 		</form>		
 		
		</div>
</body>
</html>