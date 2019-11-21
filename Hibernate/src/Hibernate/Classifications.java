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

import java.util.Set;



import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.OneToMany;

import javax.persistence.Table;

 

@Entity

@Table(name="CLASSIFICATIONS")
public class Classifications {
    	@Id

    @GeneratedValue

    @Column(name="categoryID")

    private Long categoryId;

     

    @Column(name="categoryName")

    private String categoryName;

     

    @OneToMany(mappedBy="categories")

    private Set<Items> products;



	public Classifications(Long categoryId, String categoryName,

			Set<Items> products) {

		super();

		this.categoryId = categoryId;

		this.categoryName = categoryName;

		this.products = products;

	}



	private Long getClassificationId() {

		return categoryId;

	}



	private void setClassificationId(Long categoryId) {

		this.categoryId = categoryId;

	}



	private String getClassificationName() {

		return categoryName;

	}



	private void setClassificationName(String categoryName) {

		this.categoryName = categoryName;

	}



	private Set<Items> getItems() {

		return products;

	}



	private void setItems(Set<Items> products) {

		this.products = products;

	}

    

    

    

}
