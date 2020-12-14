package com.iotapi.entity;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.MappedSuperclass;
import javax.persistence.Table;


@Entity
@Table(name = "device2")
@PrimaryKeyJoinColumn(name = "DeviceId")
public class DeviceTwo extends Device {
	
	private static final long serialVersionUID = 1L;
	
	
	private boolean isTurnedOn;
	
	public boolean getIsTurnedOn() {
		return isTurnedOn;
	}
	
	public void setIsTurnedOn(boolean isTurnedOn) {
		this.isTurnedOn = isTurnedOn;
	}
	
	////////////////
	
	private int speed = 0;

	public int geSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}	
	
		
	
}
