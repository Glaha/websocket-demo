package com.glaha.demo.websocket.controller.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint(value = "/websocket/{sid}")
@Component
public class WebSocketController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @OnOpen
    public void onOpen(Session session, @PathParam("sid") String sid) {
        logger.debug("open a ws session,{}", sid.toString());
    }

    @OnClose
    public void onClose() {
        logger.debug("ws close");
    }

    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        logger.debug("received message");
        session.getBasicRemote().sendText("为了提供服务？你想多了");
    }

    @OnError
    public void onError(Session session, Throwable error) {
        logger.debug("ws error occured");
        error.printStackTrace();
    }
}
