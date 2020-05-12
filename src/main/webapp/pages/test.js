function get() {
	var xmlHttp = new XMLHttpRequest();
	xmlHttp.onreadystatechange = function() { 
		console.log(1);
	}
	xmlHttp.open("GET", "test", true); // true for asynchronous 
	xmlHttp.send(null);
}