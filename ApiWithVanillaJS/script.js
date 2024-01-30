document.addEventListener('DOMContentLoaded', () => {
    document.getElementById('dogBtn').addEventListener('click', displayDoggoAsync);
    document.getElementById('currency').addEventListener('click', getRates);
});

async function displayDoggoAsync() {
    const API_URL = 'https://dog.ceo/api/breeds/image/random';
    let response = await fetch(API_URL)
    let json = await response.json();


    const img = document.createElement('img');
    img.src = await json.message;
    const dogImg = document.getElementById('dogImg');
    dogImg.appendChild(img);
}

function getRates() {
    const RATE_KEY = 'fca_live_cWapKOUzjg85P5aQF91E990reRAydpthjRkSRS90';
    const API_URL = 'https://api.freecurrencyapi.com/v1/latest?apikey='+RATE_KEY+'&base_currency=USD';
    fetch(API_URL)
    .then((response) => {
        return response.json();
    })
    .then((data) => {
        const rates = data.data;
        //console.log(rates);
        for(key in rates) {
            const value = rates[key];
            console.log(`${key} - ${value}`);
        }
    })
}