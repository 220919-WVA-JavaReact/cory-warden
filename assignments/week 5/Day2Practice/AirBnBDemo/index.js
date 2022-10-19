//console.log("Index loaded");

let hotels = [
    {
    listingName: "Hampton Inn",
    price: 150,
    type: "Private Room",
    imageURL: "https://gyazo.com/f52a2e14cd64b64f2e5761e0a37ab0c9.png"
    },
    {
    listingName: "Mariott",
    price: 180,
    type: "Private Room",
    imageURL: "https://gyazo.com/f52a2e14cd64b64f2e5761e0a37ab0c9.png"
    },
    {
    listingName: "Motel 8",
    price: 50,
    type: "Master Suite",
    imageURL: "https://gyazo.com/f52a2e14cd64b64f2e5761e0a37ab0c9.png"
    },
    {
    listingName: "Atlas",
    price: 250,
    type: "One Bedroom",
    imageURL: "https://gyazo.com/f52a2e14cd64b64f2e5761e0a37ab0c9.png"
    }
]

// Gather user input from fields.



let searchBtn = document.getElementById('search-button');
searchBtn.onclick = doAll;


function printValues(){
    let dest = document.getElementById('destination').value;
    let checkIn = document.getElementById('check-in').value;
    let checkOut = document.getElementById('check-out').value;
    let numGuests = document.getElementById('guests').value;
};

//Use input to search API
async function getData() {
    const options = {
        method: 'GET',
        headers: {
            'X-RapidAPI-Key': '', //took key out. too lazy to make private file.
            'X-RapidAPI-Host': 'airbnb19.p.rapidapi.com'
        }
    };
    
    let response = await fetch(`https://airbnb19.p.rapidapi.com/api/v1/searchPropertyByPlace?id=ChIJ7cv00DwsDogRAMDACa2m4K8&display_name=Chicago%2C%20IL&totalRecords=10&currency=USD&adults=2&checkin=2022-10-20&checkout=2022-10-22`, options)
        .then(response => response.json())
        .catch(err => console.error(err));

    populateData(response.data);
}


//Use response to dynamically load a page
async function populateData(hotels) {
    //target the current hotel container
    let hotelContainer = document.getElementById('room-container');
    //empty the container to clear for new search
    hotelContainer.innerHTML = '';
    //create new element/card inside the container for each item
    for (room of hotels) {
        hotelContainer.innerHTML += `<div style="border: 1px solid black; margin: 20px;">
        <img src="${room.images[0]}" />
        <h3>${room.listingName}</h3>
        <b>Price: $${room.price}</b>
        <p>Room Type: ${room.type}</p>
        </div>`
    }
}

//make a do everything function
async function doAll() {
    printValues();
    getData();
}