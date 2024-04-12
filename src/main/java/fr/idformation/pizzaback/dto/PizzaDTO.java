package fr.idformation.pizzaback.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PizzaDTO {

	/** the id. */
	private Short pizza_id;

	/** the pizza name. */
	private String name;

	/** the pizza description. */
	private String description;

	/** an URL for the image. */
	private String image;

	/** the pizza price. */
	private Float price;

	/** a list of user1 ids. */
	private List<Short> user1s;

	/**
	 *
	 */
	public PizzaDTO() {
		super();
	}

	/**
	 * @return the pizza_id
	 */
	public Short getPizza_id() {
		return pizza_id;
	}

	/**
	 * @param pizza_id the pizza_id to set
	 */
	public void setPizza_id(Short pizza_id) {
		this.pizza_id = pizza_id;
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

	public List<Short> getUser1s() {
		// TODO Auto-generated method stub
		return user1s;
	}

	public void setUser1s(List<Short> user1Ids) {
		// TODO Auto-generated method stub
		this.user1s = user1s;

	}

}
