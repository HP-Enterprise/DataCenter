package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

/**
 * Created by luj on 2015/10/22.
 */
@DataEntity(key = "8995")
public class RemoteControlPreconditionReq  extends TBoxDownBean{
    private Long eventID;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }
}
