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
public class BedType {
	@Id
	private Integer bedTypeId;
	
	@Column(name = "bed_type_name")	
	private String bedTypeName;
	
	@OneToMany(mappedBy = "bedType")
	private List<BedTypeDetail> BedTypeDetails;
}
