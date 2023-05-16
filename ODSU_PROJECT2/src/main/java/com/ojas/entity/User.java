package com.ojas.entity;

import java.util.Set;
/**
 * 
 * @author ho22078
 *
 */

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.lang.NonNull;

/**
 * User class has fields like name username and password
 */
@Entity
@Table(name = "usertab")
@SQLDelete(sql = "UPDATE usertab SET visibility = true WHERE id=?")
@Where(clause = "visibility=false")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull(message = "name shouldnt be null")
	private String name;

	@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@ojas-it\\.com$", message = "Invalid email address")
//  @Email(message =" in valid email id")
//	@NotBlank(message = "Email is required")
//	@Email(message = "Email should be valid")
//	@NotNull
	@Column(unique = true)
	private String username;

	private String password;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "rolestab", joinColumns = @JoinColumn(name = "id"))
	@Column(name = "roles")
	private Set<String> roles;

	@Column(name = "VISIBILITY")
	private boolean visibility;

	public User() {
		super();
	}

	public User(int id, @NotNull(message = "name shouldnt be null") String name,
			@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@ojas-it\\.com$", message = "Invalid email address") String username,
			String password, Set<String> roles) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.roles = roles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", roles="
				+ roles + "]";
	}

}
