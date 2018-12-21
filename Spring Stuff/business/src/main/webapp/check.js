/**
 * 
 */

let user = {};

window.onload = function() {
	populateUser();
}

function populateUser() {
	//send a get request to localhost:7001/SessionDemo/session
	fetch("http://localhost:7001/business/session").then(function(response) {
		return response.json();
	}).then(function(data) {
		//check whether there is a valid session returned 
		//define behavior for no user returned
		if (objReturned.session === null) {
			window.location = "http://localhost:7001/business/login";
		} else {
			//define behavior for user returned 
			user = data;
			//clientside rendering starts here
			document.getElementbyId("username").innerText = user.username;
			document.getElementbyId("firstname").innerText = user.firstname;
			document.getElementbyId("lastname").innerText = user.lastname;
			document.getElementbyId("email").innerText = user.email;
			
		}
	});



}