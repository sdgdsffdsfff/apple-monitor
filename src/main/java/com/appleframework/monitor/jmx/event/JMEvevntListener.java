package com.appleframework.monitor.jmx.event;

import com.alibaba.fastjson.JSONObject;

public interface JMEvevntListener {

    void handle(JSONObject event);

}
