package com.cg.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "Property")
public class Property {
	
	@Id
	@GeneratedValue
    private long propertyId;
	
	@NotBlank(message = "Type Cannot Be Blank")
	@Column(name="Type")
    private String type; 
	
	
	@NotBlank(message = "socialInfrastructure Cannot Be Blank")
	@Column (name = "socialInfrastructure")
	private String socialInfrastructure;
	
	@NotBlank(message = "constructionQuality Cannot Be Blank")
	@Column(name= "constructionQuality")
	private String constructionQuality;
	
	@NotBlank(message = "propertyName Cannot Be Blank")
	@Column(name = "propertyName")
	private String propertyName;
	
	@OneToOne(cascade = CascadeType.ALL)
    private Address address;
	
	@NotBlank(message = "sellOrRent Cannot Be Blank")
	@Column(name="sellOrRent")
	private String sellOrRent;
	
	
	@Column(name="price")
	private double price; 
	
	@Column(name = "area")
	private int sizeOfApartment;
	
	@ManyToOne(cascade = CascadeType.ALL )
	@JsonBackReference
	private Owner owner;
	
	public Property() {
		super();
	}
  

	

	public long getPropertyId() {
		return propertyId;
	}


	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getSocialInfrastructure() {
		return socialInfrastructure;
	}


	public void setSocialInfrastructure(String socialInfrastructure) {
		this.socialInfrastructure = socialInfrastructure;
	}


	public String getConstructionQuality() {
		return constructionQuality;
	}


	public void setConstructionQuality(String constructionQuality) {
		this.constructionQuality = constructionQuality;
	}


	public String getPropertyName() {
		return propertyName;
	}


	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String getSellOrRent() {
		return sellOrRent;
	}


	public void setSellOrRent(String sellOrRent) {
		this.sellOrRent = sellOrRent;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getSizeOfApartment() {
		return sizeOfApartment;
	}


	public void setSizeOfApartment(int sizeOfApartment) {
		this.sizeOfApartment = sizeOfApartment;
	}


	public Owner getOwner() {
		return owner;
	}


	public void setOwner(Owner owner) {
		this.owner = owner;
	}


	@Override
	public String toString() {
		return "Property [propertyId=" + propertyId + ", type=" + type + ", socialInfrastructure="
				+ socialInfrastructure + ", constructionQuality=" + constructionQuality + ", propertyName="
				+ propertyName + ", address=" + address + ", sellOrRent=" + sellOrRent + ", price=" + price
				+ ", sizeOfApartment=" + sizeOfApartment + ", owner=" + owner + "]";
	}
}
