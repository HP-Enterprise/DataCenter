package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class ActiveResult extends TBoxUpBean{
    private Long eventID;
    private Short rtmLifeCycle;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public Short getRtmLifeCycle() {
        return rtmLifeCycle;
    }

    public void setRtmLifeCycle(Short rtmLifeCycle) {
        this.rtmLifeCycle = rtmLifeCycle;
    }
}
