package com.synclones.iventory.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user_app")
public class User extends AuditObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2978929121947900294L;

	private Long id;
	private String username; // required
	private String password; // required
	private String passwordConfirm;
	private String passwordHint;
	private String firstName; // required
	private String lastName; // required
	private String email; // required; unique
	private String phoneNumber;
	private String epfNumber;
	private boolean enabled;
	private boolean isActive;
	private boolean accountExpired;
	private boolean accountLocked;
	private boolean credentialsExpired;
	private String profilePictureUrl;
	private Address address = new Address();
	private Set<Role> roles = new HashSet<Role>();
	private Company Company = new Company();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(nullable = false, length = 50, unique = true)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(nullable = false)
	@XmlTransient
	@JsonIgnore
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@XmlTransient
	@JsonIgnore
	@Transient
	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	@Column(name = "password_hint")
	@XmlTransient
	public String getPasswordHint() {
		return passwordHint;
	}

	public void setPasswordHint(String passwordHint) {
		this.passwordHint = passwordHint;
	}

	@Column(name = "first_name", nullable = false, length = 50)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false, length = 50)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Transient
	public String getFullName() {
		return firstName + ' ' + lastName;
	}

	@Column(nullable = false, unique = true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "phone_number")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "epf_number")
	public String getEpfNumber() {
		return epfNumber;
	}

	public void setEpfNumber(String epfNumber) {
		this.epfNumber = epfNumber;
	}

	@Column(name = "account_enabled",columnDefinition="bit(1)")
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Column(name = "is_active",columnDefinition="bit(1)")
	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Column(name = "account_expired", nullable = false,columnDefinition="bit(1)")
	public boolean isAccountExpired() {
		return accountExpired;
	}

	public void setAccountExpired(boolean accountExpired) {
		this.accountExpired = accountExpired;
	}

	@Transient
	public boolean isAccountNonExpired() {
		return !isAccountExpired();
	}

	@Column(name = "account_locked", nullable = false,columnDefinition="bit(1)")
	public boolean isAccountLocked() {
		return accountLocked;
	}

	public void setAccountLocked(boolean accountLocked) {
		this.accountLocked = accountLocked;
	}

	@Transient
	public boolean isAccountNonLocked() {
		return !isAccountLocked();
	}

	@Column(name = "credentials_expired", nullable = false,columnDefinition="bit(1)")
	public boolean isCredentialsExpired() {
		return credentialsExpired;
	}

	public void setCredentialsExpired(boolean credentialsExpired) {
		this.credentialsExpired = credentialsExpired;
	}

	@Transient
	public boolean isCredentialsNonExpired() {
		return !credentialsExpired;
	}

	@Column(name = "profile_picture_url", length = 512)
	public String getProfilePictureUrl() {
		return this.profilePictureUrl;
	}

	public void setProfilePictureUrl(String profilePictureUrl) {
		this.profilePictureUrl = profilePictureUrl;
	}

	@Embedded
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	@Fetch(FetchMode.SELECT)
	@JoinTable(name = "user_role", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = @JoinColumn(name = "role_id"))
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_id", nullable = false)
	public Company getCompany() {
		return Company;
	}

	public void setCompany(Company company) {
		Company = company;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof User)) {
			return false;
		}

		final User user = (User) o;

		return !(username != null ? !username.equals(user.getUsername()) : user.getUsername() != null);

	}

	public int hashCode() {
		return (username != null ? username.hashCode() : 0);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [username=");
		builder.append(username);
		builder.append(", full name=");
		builder.append(getFullName());
		builder.append(", epfNumber=");
		builder.append(epfNumber);
		builder.append(", enabled=");
		builder.append(enabled);
		builder.append(", isActive=");
		builder.append(isActive);
		builder.append(", accountExpired=");
		builder.append(accountExpired);
		builder.append(", accountLocked=");
		builder.append(accountLocked);
		builder.append(", credentialsExpired=");
		builder.append(credentialsExpired);
		if (roles != null) {
			builder.append(", Granted Authorities: [");

			int i = 0;
			for (Role role : roles) {
				if (i > 0) {
					builder.append(", ");
				}
				builder.append(role.toString());
				i++;
			}
			builder.append("]");
		} else {
			builder.append(", No Granted Authorities");
		}
		builder.append("]");
		return builder.toString();
	}

}
