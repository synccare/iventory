package com.synclones.iventory.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
// @XmlRootElement("UserLocationId")
public class UserLocationId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6895452880765286060L;
	private Long locationId;
	private Long id;

	@Column(name = "location_id", nullable = false,length=20,columnDefinition="BIGINT(20)")
	public Long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	@Column(name = "id", nullable = false,length=20,columnDefinition="BIGINT(20)")
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		UserLocationId pojo = (UserLocationId) o;

		if (locationId != null ? !locationId.equals(pojo.locationId) : pojo.locationId != null)
			return false;
		if (id != null ? !id.equals(pojo.id) : pojo.id != null)
			return false;

		return true;
	}

	public int hashCode() {
		int result = 0;
		result = 31 * result + (locationId != null ? locationId.hashCode() : 0);
		result = (id != null ? id.hashCode() : 0);

		return result;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer(getClass().getSimpleName());

		sb.append(" [");
		sb.append("locationId").append("='").append(getLocationId()).append("', ");
		sb.append("id").append("='").append(getId()).append("'");
		sb.append("]");

		return sb.toString();
	}

}
