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
public class Location {
	@Id
	private Integer locationId;
		
	@Column(name = "location_name")
	private String locationName;
	
	@OneToMany(mappedBy = "location")
	private List<Homestay> homestay;
	
}
