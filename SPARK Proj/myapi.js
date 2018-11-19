
function initMap() {
    var options = {
        zoom:12,
        center:{lat:25.76171,lng:-80.1918}

    }
    var map = new google.maps.Map(document.getElementById('map'), options);

    var marker = new google.maps.Marker({
        position:{lat:25.7907,lng:-80.1300},
        map:map
        
    });
}

function sendEmail() {
    alert("Thanks for signing up!");
}



