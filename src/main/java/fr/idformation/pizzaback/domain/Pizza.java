package fr.idformation.pizzaback.domain;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pizza")

public class Pizza {

	/** unique Id of a pizza. */
	@Id
	@Column(name = "piz_id")
	private Short id;

	/** name of the pizza. */
	@Column(name = "name")
	private String name;

	/** description of the pizza. */
	@Column(name = "description")
	private String description;

	/** url for retrieving the picture of the pizza. */
	@Column(name = "image")
	private String image;

	/** price of the pizza. */
	@Column(name = "price")
	private Float price;

	/** types of the pizza. */
	@ManyToMany
	@JoinTable(name = "order_pizza", joinColumns = @JoinColumn(name = "ord_id"), inverseJoinColumns = @JoinColumn(name = "piz_id"))
	private Set<Pizza> pizzas;

	/**
	 * Default constructor.
	 */
	public Pizza() {
		super();
	}

	/**
	 * @return the id
	 */
	public Short getpiz_Id() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setpiz_Id(Short id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

}
