package com.shanir.galaxyDb.models;

import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name="hosts")
@NoArgsConstructor
public class Host {
    @Column(name = "hostname", nullable = false, length = 50)
    @Id
    String hostName;

    @Column(name = "iscritical", nullable = false, length = 2)
    boolean isCritical;

    @Column(name = "stationid", nullable = false, length = 50)
    String stationId;

    @Column(name = "stationname",nullable = false, length = 50)
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

    public void setCritical(boolean isCritical) {
        isCritical = isCritical;
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

    public boolean getIsCritical() {
        return isCritical;
    }

    public String getStationId() {
        return stationId;
    }

    public String getStationName() {
        return stationName;
    }
}
