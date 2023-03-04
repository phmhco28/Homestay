package phmhco28.java.Homestay.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	@Id
	private Integer accountId;
	
	@Column
	private String mail;
	
	@Column
	private String password;
	
	@OneToMany(mappedBy = "account")
	 private List<Post> posts;
	
	@OneToMany(mappedBy = "account")
	private List<User> users;
	
	@ManyToOne
	@JoinColumn(name = "role")
	private Role role;
}
