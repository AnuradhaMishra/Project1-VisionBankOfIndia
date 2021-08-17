function RegisterCustomerValidation() {
	var firstName = document.getElementById("firstName").value;
	var lastName = document.getElementById("lastName").value;
	var password = document.getElementById("password").value;
	var confirmPassword = document.getElementById("confirmPassword").value;
	var emailId = document.getElementById("emailId").value;
	var mobileNumber = document.getElementById("mobileNumber").value;
	var city = document.getElementById("city").value;
	var balance = document.getElementById("balance").value;

	if (firstName == null) {
		document.getElementById("errorFirstName").innerHTML = "<p>*Name is mandatory</p>";
		return false;
	}
	if (lastName == null) {
		document.getElementById("errorLastName").innerHTML = "*Name is mandatory";
		return false;
	}
	if (password == null) {
		document.getElementById("errorPassword").innerHTML = "<*Password is cannot be empty";
		return false;
	}
	if(confirmPassword == null){
		document.getElementById("errorConfirmPassword").innerHTML = "*Please confirm your password";
		return false;
	}
	if(password != confirmPassword){
		document.getElementById("errorConfirmPassword").innerHTML = "*Password mismatch,Please re-enter your password";
		return false;
	}
	if(emailId == null){
		document.getElementById("errorMailId").innerHTML = "*Email Id is mandatory ";
		return false;
	}
	if(mobileNumber == null){
		document.getElementById("errorPhoneNumber").innerHTML = "*Mobile Number is mandatory ";
		return false;
	}
	if(city == null){
		document.getElementById("errorCity").innerHTML = "*City is mandatory";
		return false;
	}
	if(accountType = null){
		document.getElementById("errorAccountType").innerHTML = "*City is mandatory";
		return false;
	}
	if(balance = null){
		document.getElementById("errorBalance").innerHTML = "*Initital Amount cannot be null";
		return false;
	}
	if(accountType == "Savings"){
		if(balance<3000){
			document.getElementById("errorBalance").innerHTML = "*Initital Amount cannot be less than 5000";
			return false;
		}
	}
	else if(accountType = "Current"){
		if(balance<10000){
			document.getElementById("errorBalance").innerHTML = "*Initial Amount cannot be less than 10000";
		}
	}



}