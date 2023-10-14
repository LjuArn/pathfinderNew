const boxImgA = document.getElementById('box-a-img');
const boxImgB = document.getElementById('box-b-img');
const boxImgC = document.getElementById('box-c-img');
const boxTempA = document.getElementById('box-a-temp');
const boxTempB = document.getElementById('box-b-temp');
const boxTempC = document.getElementById('box-c-temp');

fetch("http://api.openweathermap.org/data/2.5/weather?q=Sofia&appid=8dd1b8c6c70655b59ef4f75b4d9fb753")
    .then(data => data.json())
    .then(info => {
        //Formula Kelvin to Celsius 299K − 273.15 = 25.85°C
        boxTempA.innerText = Math.round(info.main.temp - 273.15);
        boxImgA.src = '/images/weather-icons/' + info.weather[0].icon + '.png';

    })

fetch("http://api.openweathermap.org/data/2.5/weather?q=Burgas&appid=8dd1b8c6c70655b59ef4f75b4d9fb753")
    .then(data => data.json())
    .then(info => {
        //Formula Kelvin to Celsius 299K − 273.15 = 25.85°C
        boxTempB.innerText = Math.round(info.main.temp - 273.15);
        boxImgB.src = '/images/weather-icons/' + info.weather[0].icon + '.png';
    })


fetch("http://api.openweathermap.org/data/2.5/weather?q=Varna&appid=8dd1b8c6c70655b59ef4f75b4d9fb753")
    .then(data => data.json())
    .then(info => {
        //Formula Kelvin to Celsius 299K − 273.15 = 25.85°C
        boxTempC.innerText = Math.round(info.main.temp - 273.15);
        boxImgC.src = '/images/weather-icons/' + info.weather[0].icon + '.png';
    })