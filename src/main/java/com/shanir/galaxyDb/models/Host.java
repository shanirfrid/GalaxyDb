package com.shanir.galaxyDb.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Host {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String hostName;
    boolean isCritical;
    String stationId;
    String stationName;

    public Host(String hostName, boolean isCritical, String stationId, String stationName) {
        this.hostName = hostName;
        this.isCritical = isCritical;
        this.stationId = stationId;
        this.stationName = stationName;
    }


    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public void setCritical(boolean critical) {
        isCritical = critical;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getHostName() {
        return hostName;
    }

    public boolean isCritical() {
        return isCritical;
    }

    public String getStationId() {
        return stationId;
    }

    public String getStationName() {
        return stationName;
    }
}
