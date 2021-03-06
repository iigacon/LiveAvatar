package com.metek.liveavatar.socket.send;

import com.metek.liveavatar.socket.MsgData;
import com.metek.liveavatar.socket.NetConst;

import org.json.JSONException;
import org.json.JSONObject;

public class MsgLogin extends MsgData {

    public MsgLogin(String userId) {
        super(NetConst.CODE_LOGIN);
        JSONObject json = new JSONObject();
        try {
            json.put(KEY_USERID, userId);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        body = json.toString().getBytes();
        size = body.length;
    }
}
