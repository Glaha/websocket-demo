// use it in chrome console
// ws://localhost.fiddler:8080/websocket/test
var websocket = new WebSocket("ws://127.0.0.1:8080/websocket/test");
websocket.onopen = function (ev) {
    console.log("ws opened")
    websocket.send("ok")
}

websocket.onmessage = function (ev) {
    console.log("ws message sended")
    console.log(ev.data)
}