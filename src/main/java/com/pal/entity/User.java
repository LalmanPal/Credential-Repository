package com.pal.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;





@Entity
@Table(name = "users")
public class User {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    @Column(nullable = false)
	    private String name;
	    @Column(nullable = false, unique = true)
	    private String email;
	    @Column(nullable = false)
	    private String password;
	    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)	   
	    @JoinTable(
	            name = "users_roles",
	            joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id") },
	            inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id") }
	    )
	    private List<Role> roles = new ArrayList<>();
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(Long id, String name, String email, String password, List<Role> roles) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.password = password;
			this.roles = roles;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public List<Role> getRoles() {
			return roles;
		}
		public void setRoles(List<Role> roles) {
			this.roles = roles;
		}
	    
	    
}
