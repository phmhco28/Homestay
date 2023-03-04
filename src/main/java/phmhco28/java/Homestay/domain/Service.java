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
public class Service {
	@Id
	private Integer serviceId;
	
	@Column(name = "service_name")
	private String serviceName;
	
	@OneToMany(mappedBy = "service")
	private List<ServiceDetail> ServiceDetails;
}
