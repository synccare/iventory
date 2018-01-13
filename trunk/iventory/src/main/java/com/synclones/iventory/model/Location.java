package com.synclones.iventory.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "location")
// @XmlRootElement("Location")
public class Location extends AuditObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4787360214795505570L;
	private Long locationId;
	private Company company;
	private String code;
	private String name;
	private String address;
	private double longitude;
	private double latitude;
//	private Set<UserLocation> userLocations = new HashSet<UserLocation>(0);

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "location_id", nullable = false)
	public Long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_id", nullable = false)
	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Column(name = "code", length = 45)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "address", length = 45)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "longitude", nullable = false, precision = 22, scale = 0)
	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Column(name = "latitude", nullable = false, precision = 22, scale = 0)
	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "location")
//	public Set<UserLocation> getUserLocations() {
//		return this.userLocations;
//	}
//
//	public void setUserLocations(Set<UserLocation> userLocations) {
//		this.userLocations = userLocations;
//	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Location pojo = (Location) o;

		if (company != null ? !company.equals(pojo.company) : pojo.company != null)
			return false;
		if (code != null ? !code.equals(pojo.code) : pojo.code != null)
			return false;
		if (name != null ? !name.equals(pojo.name) : pojo.name != null)
			return false;
		if (address != null ? !address.equals(pojo.address) : pojo.address != null)
			return false;

		return true;
	}

	public int hashCode() {
		int result = 0;
		result = (company != null ? company.hashCode() : 0);
		result = 31 * result + (code != null ? code.hashCode() : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (address != null ? address.hashCode() : 0);

		return result;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer(getClass().getSimpleName());

		sb.append(" [");
		sb.append("locationId").append("='").append(getLocationId()).append("', ");
		sb.append("company").append("='").append(getCompany()).append("', ");
		sb.append("code").append("='").append(getCode()).append("', ");
		sb.append("name").append("='").append(getName()).append("', ");
		sb.append("address").append("='").append(getAddress()).append("', ");
		sb.append("longitude").append("='").append(getLongitude()).append("', ");
		sb.append("latitude").append("='").append(getLatitude()).append("', ");

		sb.append("]");

		return sb.toString();
	}

}
