/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

/**
 *
 * @author Gary
 */




import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

import javax.persistence.Table;



@Entity

@Table(name = "Items")
public class Items {
    
	@Id

    @GeneratedValue

    @Column(name="productID")

	private Integer productID;

	

	@Column(name="productCode")

	private String productCode;

	

	@Column(name="productName")

	private String productName;

	

	@ManyToOne

	@JoinColumn(name="categoryID")

	private Integer categoryID;

	

	public Items() {}



	public Items(Integer productID, Integer categoryID, String productCode,

			String productName, Integer priceID) {

		super();

		this.productID = productID;

		this.categoryID = categoryID;

		this.productCode = productCode;

		this.productName = productName;

		this.categoryID = priceID;

	}



	private Integer getItemID() {

		return productID;

	}



	private void setItemID(Integer productID) {

		this.productID = productID;

	}



	private String getItemCode() {

		return productCode;

	}



	private void setItemCode(String productCode) {

		this.productCode = productCode;

	}



	private String getItemName() {

		return productName;

	}



	private void setItemName(String productName) {

		this.productName = productName;

	}



	private Integer getClassificationID() {

		return categoryID;

	}



	private void setClassificationID(Integer categoryID) {

		this.categoryID = categoryID;

	}

	
}
