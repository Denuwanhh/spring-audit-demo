package demo.audit.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Category implements Serializable{

	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "category_ID")
	private Integer categoryID;
	@Column(name = "category")
	private String category;
	@OneToMany(mappedBy="category")
	@JsonIgnore
	private List<Post> posts;
	
	/**
	 * @return the categoryID
	 */
	public Integer getCategoryID() {
		return categoryID;
	}
	/**
	 * @param categoryID the categoryID to set
	 */
	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}
	/**
	 * @return the Category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param categort the Category to set
	 */
	public void setCategory(String Category) {
		this.category = Category;
	}
	
	
}
