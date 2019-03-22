package com.github.ajanthan.mqtt.event.generators;


import com.github.ajanthan.mqtt.event.model.Device;

import java.util.concurrent.ThreadLocalRandom;

public class SMARTMeterEventGenerator {
    public  String getEvent(){


        Device [] devices={
            new Device(11000,23000,440,66,"D"),
            new Device(11000,23000,440,66,"D"),
            new Device(11000,23000,440,66,"D"),
            new Device(11001,23001,440,66,"D"),
            new Device(11001,23001,440,66,"D"),
            new Device(11001,23001,440,66,"D"),
            new Device(11001,23001,440,66,"D"),
            new Device(11001,23001,440,66,"D"),
            new Device(11002,23002,440,66,"D"),
            new Device(11002,23002,440,66,"D"),
            new Device(11002,23002,440,66,"D"),
            new Device(11002,23002,440,66,"D"),
            new Device(11002,23002,440,66,"D"),
            new Device(11003,23003,440,66,"D"),
            new Device(11003,23003,440,66,"D"),
            new Device(11003,23003,440,66,"D"),
            new Device(11003,23003,440,66,"D")
        };
        int currentDeviceID=ThreadLocalRandom.current().nextInt(devices.length);

        String [] status={
            "Connected", //Connected
            "Connected", //Connected
            "Connected", //Connected
            "Connected", //Connected
            "Connected", //Connected
            "Disconnected", //Disconnected
            "Disconnected", //Disconnected
            "Disconnected", //Disconnected
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Up", //Up
            "Down", //Down
            "Down", //Down
            "Down", //Down
            "Down", //Down
            "Down", //Down

        };
        int currentStatus=ThreadLocalRandom.current().nextInt(status.length);
        Device currentDevice=devices[currentDeviceID];
        currentDevice.setStatus(status[currentStatus]);

        return currentDevice.toEvent();
    }
}
