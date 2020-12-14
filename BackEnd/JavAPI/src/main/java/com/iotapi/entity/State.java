package com.iotapi.entity;

public class State {
	
	private Boolean isTurnedOn;
	
	private int speed;
	
	
	
	public Boolean getIsTurnedOn() {
		return isTurnedOn;
	}
	
	public void setIsTurnedOn(Boolean isTurnedOn) {
		this.isTurnedOn = isTurnedOn;
	}
	
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	@Override
	public String toString() {
        return "{" +
        		"isTurnedOn='" + isTurnedOn + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
