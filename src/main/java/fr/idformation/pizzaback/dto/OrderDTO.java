package fr.idformation.pizzaback.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
	/** the id. */
	private Short ord_id;

	/** the user id. */
	private Short usr_id;

	/** the date of order. */
	private Date date;

	/** total of the order. */
	private Float total_amount;

	/**
	 *
	 */
	public OrderDTO() {
		super();
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
	 * @return the usr_id
	 */
	public Short getUsr_id() {
		return usr_id;
	}

	/**
	 * @param short1 the usr_id to set
	 */
	public void setUsr_id(Short short1) {
		this.usr_id = short1;
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

	public void setUsr_id1(Short usr_id2) {
		// TODO Auto-generated method stub

	}

}
