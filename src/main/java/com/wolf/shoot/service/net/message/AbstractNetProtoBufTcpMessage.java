package com.wolf.shoot.service.net.message;

/**
 * Created by jwp on 2017/2/17.
 */
public abstract class AbstractNetProtoBufTcpMessage extends AbstractNetProtoBufMessage{

    private long sessionId;

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }
}