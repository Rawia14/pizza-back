package fr.idformation.pizzaback.domain;

import java.util.HashSet;
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
	@Column(name = "pizza_id")
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
	@JoinTable(name = "user", joinColumns = { @JoinColumn(name = "pizza_id") }, inverseJoinColumns = {
			@JoinColumn(name = "id") })
	private Set<User1> user1s;

	/**
	 * Default constructor.
	 */
	public Pizza() {
		super();
	}

	/**
	 * @return the id
	 */
	public Short getpizza_Id() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setpizza_Id(Short id) {
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

	public Set<User1> getUsers() {
		return user1s;
	}

	public void setUsers(final Set<User1> user1s) {
		this.user1s = user1s;
	}

	public void addUser(final User1 user1) {
		if (user1s == null) {
			user1s = new HashSet<>();
		}

		user1.addPizza(this);
		user1s.add(user1);
	}

	public void removeUser(final User1 user1) {
		if (user1s == null) {
			return;
		}

		user1s.remove(user1);
		user1.removePizza(this);

	}

}
