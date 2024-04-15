package fr.idformation.pizzaback.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class LineDTO {

	/** the technical id. */
	private Short id;

	/** the id of the order. */
	private Short ord_id;

	/** the id of the pizza. */
	private Short piz_id;

	/** the quantity. */
	private String quantity;

	/**
	 *
	 */
	public LineDTO() {
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
	 * @param string the quantity to set
	 */
	public void setQuantity(String string) {
		this.quantity = string;
	}

}
