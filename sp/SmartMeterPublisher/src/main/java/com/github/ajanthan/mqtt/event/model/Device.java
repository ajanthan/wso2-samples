package com.github.ajanthan.mqtt.event.model;

public class Device {
    private int badgeID;
    private int code;
    private int model;
    private int type;
    private String status;
    private String lastStatus;

    public String getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    public Device(int badgeID, int code, int model, int type, String staus) {
        this.badgeID = badgeID;
        this.code = code;
        this.model = model;
        this.type = type;
        this.status = staus;
        this.lastStatus=null;
    }

    public int getBadgeID() {
        return badgeID;
    }

    public void setBadgeID(int badgeID) {
        this.badgeID = badgeID;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.lastStatus=this.status;
        this.status = status;
    }


    public String toEvent() {
        String eventData="{\n" +
            "   \"event\":{\n" +
            "      \"badgeID\":{0},\n" +
            "      \"code\":{1},\n" +
            "      \"model\":{2},\n" +
            "      \"type\":{3},\n" +
            "      \"status\":\"{4}\"\n" +
            "   }\n" +
            "}";
        eventData=eventData.replace("{0}",Integer.toString(getBadgeID())).
                            replace("{1}",Integer.toString(getCode())).
                            replace("{2}",Integer.toString(getModel())).
                            replace("{3}",Integer.toString(getType())).
                            replace("{4}",getStatus());
        return eventData;
    }
}
