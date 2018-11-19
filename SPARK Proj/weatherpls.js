let whateverWeather = {};

 function getwhateverWeather() {
      fetch('http://api.openweathermap.org/data/2.5/weather?q=Miami,us&units=imperial&APPID=73c523f18798d20ede69efcf0069aaa4').then((response) => {return response.json();
    }).then((data) => {
        whateverWeather = data;
        whateverWind();
        whateverTemp();
        whateverRain();

    });
}

function whateverWind() {
    let newPara = document.createElement("p")
    newPara.innerText = 'Wind speed: '+whateverWeather.wind.speed+'mph';
    document.getElementById("windDiv").appendChild(newPara);
}

function whateverTemp() {
    let newPara = document.createElement("p")
    newPara.innerText = 'Current temp: '+whateverWeather.main.temp+'F';
    document.getElementById("tempDiv").appendChild(newPara);
}

function whateverRain() {
    let newPara = document.createElement("p")
    newPara.innerText = 'Cloud index: '+whateverWeather.clouds.all+'';
    document.getElementById("rainDiv").appendChild(newPara);
}

//event listener on switch
window.onload=function() {
    getwhateverWeather();
}
