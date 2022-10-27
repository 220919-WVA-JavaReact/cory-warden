//https://github.com/220919-WVA-JavaReact/notes/blob/main/week%205/UI/Notes/General/Timing.md
////////////////////////////////////////SETTING TIMEOUTS////////////////////////////////////////////////////////////////
// // Global variable representing the current color of the div
// let color = 'grey'

// window.onload = () => {
// 	// Set the initial color of the div
// 	document.getElementById('myDiv').style.backgroundColor = color
// 	document.getElementById('myButton').onclick = waitForLoading
// }

// // This function will change the button text to "Loading..."
// // and then swap the background color of the div from grey to green or vice versa.
// function waitForLoading() {
// 	console.log('Loading...')
// 	document.getElementById('myButton').innerHTML = 'Loading...'
// 	// Wait two seconds and then change color
// 	setTimeout(changeColor, 2000)
// }

// // This function switches the color of the div
// function changeColor() {
// 	document.getElementById('myButton').innerHTML = 'Click Me'
	
// 	color = color == 'grey' ? 'green' : 'grey'
	
// 	document.getElementById('myDiv').style.backgroundColor = color
// }



////////////////////////////////////////CANCELLING TIMEOUTS/////////////////////////////////////////////////////////////
// // Global variable representing the current color of the div
// let color = 'grey'
// // Global variable representing the button so we don't have to select it every time.
// let myButton = document.getElementById('myButton')

// window.onload = () => {
// 	// Set the initial color of the div
// 	document.getElementById('myDiv').style.backgroundColor = color
// 	myButton.onclick = waitForLoading
// }

// // This function will change the button text to "Loading..."
// // and then swap the background color of the div from grey to green or vice versa.
// function waitForLoading() {
// 	console.log('Loading...')
// 	myButton.innerHTML = 'Cancel!'
// 	myButton.onclick = cancelTimeout
// 	// Wait two seconds and then change color
// 	let timeout = setTimeout(changeColor, 2000)
	
// 	function cancelTimeout() {
// 		console.log('Cancel the color change')
// 		clearTimeout(timeout)
// 		myButton.innerHTML = 'Click Me'
// 		myButton.onclick = waitForLoading
// 	}
// }

// // This function switches the color of the div
// function changeColor() {
// 	myButton.innerHTML = 'Click Me'
// 	myButton.onclick = waitForLoading
	
// 	color = color == 'grey' ? 'green' : 'grey'
	
// 	document.getElementById('myDiv').style.backgroundColor = color
// }



////////////////////////////////////////SETTING INTERVAL/////////////////////////////////////////////////////////////
// let seconds = 0
// // declare the intervalVariable for later use.
// let intervalVariable = null

// window.onload = () => {
// 	// Set the initial color of the div
// 	document.getElementById('start').onclick = start
// 	document.getElementById('stop').onclick = stop
// }

// // This function will create the interval
// function start() {
// 	seconds = 0
// 	document.getElementById('time').innerHTML = '0:00'
// 	intervalVariable = setInterval(tickUp, 1000)
// }

// // This function will iterate the timer.
// function tickUp() {
// 	seconds = seconds + 1
// 	timer = `${Math.floor(seconds/60)}:${new String(seconds%60).padStart(2, '0')}`
// 	document.getElementById('time').innerHTML = timer
// }

// // This function clears the interval
// function stop() {
// 	clearInterval(intervalVariable)

// }



for(let x = 10; x >= 0; x-=2){

    console.log(x);

}
