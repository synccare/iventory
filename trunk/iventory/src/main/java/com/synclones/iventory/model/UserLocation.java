package com.synclones.iventory.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "user_location")
//@XmlRootElement(name = "UserLocation")
@AssociationOverrides({
	@AssociationOverride(name="id.location",joinColumns=@JoinColumn(name="location_id")),
	@AssociationOverride(name="id.user",joinColumns=@JoinColumn(name="id"))
})
public class UserLocation extends AuditObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8202228600448765377L;
	private UserLocationId id;
	private User user;
	private Location location;
	private Date assignDate;
	private String assignUser;
	private Date reassignDate;
	private Boolean isActive;

	@EmbeddedId
	public UserLocationId getId() {
		return this.id;
	}

	public void setId(UserLocationId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "location_id", nullable = false, insertable = false, updatable = false)
	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "assign_date", length = 10)
	public Date getAssignDate() {
		return this.assignDate;
	}

	public void setAssignDate(Date assignDate) {
		this.assignDate = assignDate;
	}

	@Column(name = "assign_user", length = 45)
	public String getAssignUser() {
		return this.assignUser;
	}

	public void setAssignUser(String assignUser) {
		this.assignUser = assignUser;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "reassign_date", length = 10)
	public Date getReassignDate() {
		return this.reassignDate;
	}

	public void setReassignDate(Date reassignDate) {
		this.reassignDate = reassignDate;
	}

	@Column(name = "is_active")
	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		UserLocation pojo = (UserLocation) o;

//		if (user != null ? !user.equals(pojo.user) : pojo.user != null)
//			return false;
//		if (location != null ? !location.equals(pojo.location) : pojo.location != null)
//			return false;
		if (assignDate != null ? !assignDate.equals(pojo.assignDate) : pojo.assignDate != null)
			return false;
		if (assignUser != null ? !assignUser.equals(pojo.assignUser) : pojo.assignUser != null)
			return false;
		if (reassignDate != null ? !reassignDate.equals(pojo.reassignDate) : pojo.reassignDate != null)
			return false;
		if (isActive != null ? !isActive.equals(pojo.isActive) : pojo.isActive != null)
			return false;

		return true;
	}

	public int hashCode() {
		int result = 0;
//		result = (user != null ? user.hashCode() : 0);
//		result = 31 * result + (location != null ? location.hashCode() : 0);
		result = 31 * result + (assignDate != null ? assignDate.hashCode() : 0);
		result = 31 * result + (assignUser != null ? assignUser.hashCode() : 0);
		result = 31 * result + (reassignDate != null ? reassignDate.hashCode() : 0);
		result = 31 * result + (isActive != null ? isActive.hashCode() : 0);

		return result;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer(getClass().getSimpleName());

		sb.append(" [");
		sb.append("id").append("='").append(getId()).append("', ");
//		sb.append("user").append("='").append(getUser()).append("', ");
//		sb.append("location").append("='").append(getLocation()).append("', ");
		sb.append("assignDate").append("='").append(getAssignDate()).append("', ");
		sb.append("assignUser").append("='").append(getAssignUser()).append("', ");
		sb.append("reassignDate").append("='").append(getReassignDate()).append("', ");
		sb.append("isActive").append("='").append(getIsActive()).append("'");
		sb.append("]");

		return sb.toString();
	}

}
