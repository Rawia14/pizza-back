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
@Table(name = "order_line")
public class Line {

	/** unique Id of a order_line. */
	@Id
	@Column(name = "order_line_id")
	private Short id;

	/** Id of the order. */
	@Column(name = "ord_id")
	private Short ord_id;

	/** Id of the pizza. */
	@Column(name = "piz_id")
	private Short piz_id;

	/** the quantity */
	@Column(name = "quantity")
	private String quantity;

	/** the order_line */
	@ManyToMany
	@JoinTable(name = "order_order_line", joinColumns = @JoinColumn(name = "ord_id"), inverseJoinColumns = @JoinColumn(name = "order_line_id"))
	private Set<Order> order;

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
	 * @return the ord_id
	 */
	public Short getOrd_id() {
		return ord_id;
	}

	/**
	 * @param ord_id the ord_id to set
	 */
	public void setOrd_id(Short ord_id) {
		this.ord_id = ord_id;
	}

	/**
	 * @return the piz_id
	 */
	public Short getPiz_id() {
		return piz_id;
	}

	/**
	 * @param piz_id the piz_id to set
	 */
	public void setPiz_id(Short piz_id) {
		this.piz_id = piz_id;
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
	public Set<Order> getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Set<Order> order) {
		this.order = order;
	}
}
