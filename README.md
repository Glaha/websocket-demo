# websocket-demo

websocket server demo by java 

## Get started

1. mvn clean package -Dmaven.test.skip=true
2. java -jar
3. run message-test.js in chrome console/handshake.sh for ws open test

## notes

> if you are using fiddler , try as below \
1)打开Fiddler，点开菜单栏的Rules，选择Customize Rules... \
2)这时会打开CustomRules.js文件，在class Handlers中加入以下代码 \

```javascript
    static function OnWebSocketMessage(oMsg: WebSocketMessage) {
        // Log Message to the LOG tab
        FiddlerApplication.Log.LogString(oMsg.ToString());
    }
```

> 你就可以在log里面看到websocket的日志，当然没有什么用，看不懂。
