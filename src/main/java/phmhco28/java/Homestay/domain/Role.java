package phmhco28.java.Homestay.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
	@Id
	private Integer roleId;
	
	@Column(length = 100, nullable = false, columnDefinition = "nvarchar")
	private String roleName;
	
	@OneToMany(mappedBy = "role")
	private List<Account> accounts;
}
