package com.example.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="prdcategory")
public class PrdCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String categoryname;
	private int userid;
	
	@OneToMany(mappedBy = "categoryid")
	private List<PrdSubCategory> prdsubcategorylist;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public List<PrdSubCategory> getPrdsubcategorylist() {
		return prdsubcategorylist;
	}
	public void setPrdsubcategorylist(List<PrdSubCategory> prdsubcategorylist) {
		this.prdsubcategorylist = prdsubcategorylist;
	}
	
	@Override
	public String toString() {
		return "PrdCategory [id=" + id + ", categoryname=" + categoryname + ", userid=" + userid
				+ ", prdsubcategorylist=" + prdsubcategorylist + "]";
	}
	
	
	

}
