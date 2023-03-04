package phmhco28.java.Homestay.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomestayDto {
	private Integer homestayId;
	private String homestayName;
	private String homestayAddress;
	private String description;
	private Integer locationId;
}
