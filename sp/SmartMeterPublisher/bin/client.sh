#!/bin/bash

CARBON_CLASSPATH=""
for f in ../libs/*.jar
do   
    CARBON_CLASSPATH="$CARBON_CLASSPATH":$f
done
for t in ../target/*.jar
do
    CARBON_CLASSPATH="$CARBON_CLASSPATH":$t
done
echo $CARBON_CLASSPATH
java -classpath "$CARBON_CLASSPATH" com.github.ajanthan.mqtt.event.MqttClient $*