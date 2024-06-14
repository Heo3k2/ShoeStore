package com.shoestoredb.entity3;
// Generated Apr 20, 2024, 2:20:15 PM by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * OrderDetail generated by hbm2java
 */
@Entity
@Table(name = "order_detail", catalog = "shoestoredb")
public class OrderDetail implements java.io.Serializable {

	private OrderDetailId id;
	private Shoe shoe;
	private ShoeOrder shoeOrder;

	public OrderDetail() {
	}

	public OrderDetail(OrderDetailId id, Shoe shoe, ShoeOrder shoeOrder) {
		this.id = id;
		this.shoe = shoe;
		this.shoeOrder = shoeOrder;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "orderId", column = @Column(name = "order_id", nullable = false)),
			@AttributeOverride(name = "shoeId", column = @Column(name = "shoe_id", nullable = false)),
			@AttributeOverride(name = "quantity", column = @Column(name = "quantity", nullable = false)),
			@AttributeOverride(name = "subTotal", column = @Column(name = "sub_total", nullable = false, precision = 12, scale = 0)) })
	public OrderDetailId getId() {
		return this.id;
	}

	public void setId(OrderDetailId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shoe_id", nullable = false, insertable = false, updatable = false)
	public Shoe getShoe() {
		return this.shoe;
	}

	public void setShoe(Shoe shoe) {
		this.shoe = shoe;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id", nullable = false, insertable = false, updatable = false)
	public ShoeOrder getShoeOrder() {
		return this.shoeOrder;
	}

	public void setShoeOrder(ShoeOrder shoeOrder) {
		this.shoeOrder = shoeOrder;
	}

}