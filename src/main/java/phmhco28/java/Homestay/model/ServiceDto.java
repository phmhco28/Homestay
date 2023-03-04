package phmhco28.java.Homestay.model;

import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDto{
	
	private long serviceId;
	@NotBlank
	private String serviceName;
	private String icon;
	
}
