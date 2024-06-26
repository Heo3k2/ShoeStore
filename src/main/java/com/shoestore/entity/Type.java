package com.shoestore.entity;
// Generated Apr 20, 2024, 2:20:15 PM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Type generated by hbm2java
 */
@Entity
@Table(name = "type", catalog = "shoestoredb", uniqueConstraints = @UniqueConstraint(columnNames = "type_name"))
@NamedQueries({
	@NamedQuery(name = "Type.findAll", query = "SELECT t FROM Type t ORDER BY t.typeName"),
	@NamedQuery(name = "Type.countAll", query = "SELECT COUNT(*) FROM Type"),
	@NamedQuery(name = "Type.findByName", query = "SELECT t FROM Type t WHERE t.typeName = :typeName"),
	@NamedQuery(name = "Type.listTypeName", query = "SELECT typeName FROM Type"),
	@NamedQuery(name = "Type.findAllOrderByTypeId", query = "SELECT t.typeName FROM Type t JOIN Shoe s ON t.typeId = s.type.typeId GROUP BY t.typeName ORDER BY t.typeId"),
})
public class Type implements java.io.Serializable {

	private int typeId;
	private String typeName;
	private Set<Shoe> shoes = new HashSet<Shoe>(0);

	public Type() {
	}
	
	public Type(String typeName) {
		this.typeName = typeName;
	}
	
	public Type(int typeId, String typeName) {
		this.typeId = typeId;
		this.typeName = typeName;
	}

	public Type(int typeId, String typeName, Set<Shoe> shoes) {
		this.typeId = typeId;
		this.typeName = typeName;
		this.shoes = shoes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_id", unique = true, nullable = false)
	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	@Column(name = "type_name", unique = true, nullable = false, length = 50)
	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "type")
	public Set<Shoe> getShoes() {
		return this.shoes;
	}

	public void setShoes(Set<Shoe> shoes) {
		this.shoes = shoes;
	}

}
