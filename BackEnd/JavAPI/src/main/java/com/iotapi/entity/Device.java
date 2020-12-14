package com.iotapi.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name = "Device")
@Inheritance(strategy = InheritanceType.JOINED)
public class Device implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;


	Long id;
	
	private String type;
	
	private String label;
	
	private String manufacturer;
	
	//private State state;
		
	
	public Device() {
	}
	
	
	public Device(String label) {
		this.label = label;
	}
	
	public Device(String type, String label, String manufacturer) {
		this.type = type;
		this.label = label;
		this.manufacturer = manufacturer;
	}
	
	
	@Id
    @GeneratedValue
    @Column(name="id", unique=true , nullable=false )
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="type", length=30)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	@Column(name="label", length=100)
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Column(name="manufacturer", length=100)
	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
//	@Column(name="state")
//	public State getState() {
//		return state;
//	}
//	
//	public void setState(State state) {
//		this.state = state;
//	}
//	
//		
//	 @Override
//	    public String toString() {
//	        return "Device{" +
//	                "id=" + id +
//	                ", type='" + type + '\'' +
//	                ", label='" + label + '\'' +
//	                ", manufacturer='" + manufacturer + '\'' +
//	                ", state =" + state +
//	                '}';
//	    }
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Device ID
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(nullable=false, unique=true)
//	private Long id;
//		
//	
//	// Device Type (light, fan, door, etc)
//	@Column(nullable=false, length=50)
//	private String type;
//	
//	// Label (main door, bathroom light, etc)
//	@Column(nullable=false, length=150)
//	private String label;
//	
//	
//	// Manufaturer's name (Philips, LG, etc)
//	@Column(length=100)
//	private String manufacturer;
//	
//	
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//	public String getLabel() {
//		return label;
//	}
//
//	public void setLabel(String label) {
//		this.label = label;
//	}
//
//	public String getManufacturer() {
//		return manufacturer;
//	}
//
//	public void setManufacturer(String manufacturer) {
//		this.manufacturer = manufacturer;
//	}
	
	//state

}



