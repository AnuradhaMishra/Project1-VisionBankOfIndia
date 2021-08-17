function validate() {
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	var accounttype = document.getElementsByName("type");

	if (username.length == 0) {
		alert("Please enter your username!!!")
		return false;
	}
	else if (password.length == 0) {
		alert("Please enter your password!!!")
		return false;
	}
	else {

		employee = document.getElementById("employee");
		customer = document.getElementById("customer");
		if (employee.checked == true) {
			document.loginForm.action = "LoginEmployeeServlet";
			alert("Welcome Employee")
			return true;

		}
		else {
			document.loginForm.action = "LoginCustomerServlet";
			alert("Welcome Customer")

			return true;
		}

		alert("Please select your account type!!!")
		return false;


	}
}







