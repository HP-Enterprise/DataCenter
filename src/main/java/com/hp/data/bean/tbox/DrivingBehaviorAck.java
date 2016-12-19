package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

/**
 * Created by jackl on 2016/12/19.
 */
@DataEntity(key = "8995")
public class DrivingBehaviorAck extends TBoxDownBean{
    private Long eventID;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }
}
