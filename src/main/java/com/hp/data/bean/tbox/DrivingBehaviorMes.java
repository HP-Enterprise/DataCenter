package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

/**
 * Created by jackl on 2016/12/19.
 */
@DataEntity(key = "8995")
public class DrivingBehaviorMes extends TBoxUpBean{
    private Long eventID;
    private Integer[]  lateralAcceleration;//横向加速度信息 *40
    private Integer[]  driveAcceleration;//行驶方向加速度信息 *40
    private Short[]  brake;//紧急刹车信号 *40
    private Integer[]  speed;//车速信息 *40
    private Integer[]  lws;//方向盘转角信息 *40
    private Integer[]  bcvol;//方向盘开关信息 *40
    private Short[]  cruise;//车辆加速减速信息 *40

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Integer[] getLateralAcceleration() {
        return lateralAcceleration;
    }

    public void setLateralAcceleration(Integer[] lateralAcceleration) {
        this.lateralAcceleration = lateralAcceleration;
    }

    public Integer[] getDriveAcceleration() {
        return driveAcceleration;
    }

    public void setDriveAcceleration(Integer[] driveAcceleration) {
        this.driveAcceleration = driveAcceleration;
    }

    public Short[] getBrake() {
        return brake;
    }

    public void setBrake(Short[] brake) {
        this.brake = brake;
    }

    public Integer[] getSpeed() {
        return speed;
    }

    public void setSpeed(Integer[] speed) {
        this.speed = speed;
    }

    public Integer[] getLws() {
        return lws;
    }

    public void setLws(Integer[] lws) {
        this.lws = lws;
    }

    public Integer[] getBcvol() {
        return bcvol;
    }

    public void setBcvol(Integer[] bcvol) {
        this.bcvol = bcvol;
    }

    public Short[] getCruise() {
        return cruise;
    }

    public void setCruise(Short[] cruise) {
        this.cruise = cruise;
    }
}
