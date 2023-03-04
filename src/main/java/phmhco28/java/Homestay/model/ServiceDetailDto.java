package phmhco28.java.Homestay.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDetailDto {
	private Integer serviceId;
	private Integer roomInfoId;
	private String description;
}
