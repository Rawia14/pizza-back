package fr.idformation.pizzaback.domain;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "`order`")
public class Order {

	/** unique Id of a order. */

	@Id
	@Column(name = "ord_id")
	private Short id;

	/** Id of the user. */
	@Column(name = "usr_id")
	private Short usr_id;

	/** date of the order. */
	@Column(name = "date")
	private Date date;

	/** total of the order. */
	@Column(name = "total_amount")
	private Float total_amount;

	/** orders of users. */
	@ManyToMany
	@JoinTable(name = "pizza", joinColumns = { @JoinColumn(name = "piz_id") }, inverseJoinColumns = {
			@JoinColumn(name = "ord_id") })
	private Set<Pizza> pizza;

	/**
	 * Default constructor.
	 */
	public Order() {
		super();
	}

	/**
	 * @return the id
	 */
	public Short getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Short id) {
		this.id = id;
	}

	/**
	 * @return the usr_id
	 */
	public Short getUsr_id() {
		return usr_id;
	}

	/**
	 * @param usr_id the usr_id to set
	 */
	public void setUsr_id(Short usr_id) {
		this.usr_id = usr_id;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the total_amount
	 */
	public Float getTotal_amount() {
		return total_amount;
	}

	/**
	 * @param total_amount the total_amount to set
	 */
	public void setTotal_amount(Float total_amount) {
		this.total_amount = total_amount;
	}

	/**
	 * @return the pizza
	 */
	public Set<Pizza> getPizza() {
		return pizza;
	}

	/**
	 * @param pizza the pizza to set
	 */
	public void setPizza(Set<Pizza> pizza) {
		this.pizza = pizza;
	}

	public void addOrder(Pizza pizza2) {
		// TODO Auto-generated method stub

	}

	public void removeOrder(Pizza pizza2) {
		// TODO Auto-generated method stub

	}

}
