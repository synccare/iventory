package com.synclones.iventory.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
// @XmlRootElement("Company")
public class Company extends AuditObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5390232992076419930L;
	private Long companyId;
	private String name;
	private String description;
//	private Set<User> users = new HashSet<User>(0);
//	private Set<Location> locations = new HashSet<Location>(0);

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "company_id", nullable = false)
	public Long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "company")
//	public Set<User> getUsers() {
//		return this.users;
//	}
//
//	public void setUsers(Set<User> users) {
//		this.users = users;
//	}

//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "company")
//	public Set<Location> getLocations() {
//		return this.locations;
//	}
//
//	public void setLocations(Set<Location> locations) {
//		this.locations = locations;
//	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Company pojo = (Company) o;

		if (name != null ? !name.equals(pojo.name) : pojo.name != null)
			return false;
		if (description != null ? !description.equals(pojo.description) : pojo.description != null)
			return false;

		return true;
	}

	public int hashCode() {
		int result = 0;
		result = (name != null ? name.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);

		return result;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer(getClass().getSimpleName());

		sb.append(" [");
		sb.append("companyId").append("='").append(getCompanyId()).append("', ");
		sb.append("name").append("='").append(getName()).append("', ");
		sb.append("description").append("='").append(getDescription()).append("', ");

		sb.append("]");

		return sb.toString();
	}

}
