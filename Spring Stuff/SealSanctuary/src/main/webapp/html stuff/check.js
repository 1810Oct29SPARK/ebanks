/**
 * 
 */

let user = {};

window.onload = function() {
	populateUser();
}

function populateUser() {
	//send a get request to localhost:7001/SealSanctuary/session
	fetch("http://localhost:7001/SealSanctuary/session").then(function(response) {
		return response.json();
	}).then(function(data) {
		//check whether there is a valid session returned 
		//define behavior for no user returned
		if (objReturned.session === null) {
			window.location = "http://localhost:7001/SealSanctuary/login";
		} else {
			//define behavior for user returned 
			user = data;
			//clientside rendering starts here
			document.getElementbyId("firstname").innerText = user.firstname;
			document.getElementbyId("lastname").innerText = user.lastname;
			document.getElementbyId("lastname").innerText = user.lastname;
			document.getElementbyId("email").innerText = user.email;
			document.getElementbyId("phone").innerText = user.phone;
			document.getElementbyId("address").innerText = user.address;
			
		}
	});



}