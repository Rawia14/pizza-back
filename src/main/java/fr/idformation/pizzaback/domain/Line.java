package fr.idformation.pizzaback.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_line")
public class Line {

	/** unique Id of a order_line. */
	@Id
	@Column(name = "id")
	private Short id;

	/** Id of the order. */
	/**
	 * @Column(name = "ord_id") private Short ord_id;
	 */

	/** Id of the pizza. */
	@Column(name = "piz_id")
	private Short pizId;

	/** the quantity */
	@Column(name = "quantity")
	private String quantity;

	/** the order_line */
	@ManyToOne
	@JoinTable(name = "order", joinColumns = @JoinColumn(name = "ord_id"), inverseJoinColumns = @JoinColumn(name = "id"))
	private Order order;

	/**
	 * Default constructor.
	 */
	public Line() {
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
	 * @return the piz_id
	 */
	public Short getPiz_id() {
		return pizId;
	}

	/**
	 * @param piz_id the piz_id to set
	 */
	public void setPiz_id(Short pizId) {
		this.pizId = pizId;
	}

	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
}
