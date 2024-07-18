package com.backend.Agriculture.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	@Column(length=30)
	@NotBlank(message="name must be supplied")
	private String pname;
	
	@Column(length=30)
	@NotBlank(message="name must be supplied")
	private String brand;
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;
	
	private double price;
	
	private String photo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_timestamp", insertable = true, updatable = false)
	private Date createdTimestamp=new Date();    //date generated here not mapped in Dto
	
	@ManyToOne
	@JoinColumn(name="sellerId")
	private Seller seller;
	
	
	
	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getPhoto() {
		return photo;
	}



	public void setPhoto(String photo) {
		this.photo = photo;
	}



	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}



	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}



	public Seller getSeller() {
		return seller;
	}



	public void setSeller(Seller seller) {
		this.seller = seller;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", pname=" + pname + ", pcategory=" + category.getCategoryName() + ", price="
				+ price + ", photo=" + photo + ", createdTimestamp=" + createdTimestamp + "]";
	}
}

