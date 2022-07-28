function showTime() {
    setInterval(_showTime,1000);    
}

var elem = document.getElementById("myClock");
function _showTime() {
    elem.textContent= Date.now().toLocaleString("tr-TR");
}