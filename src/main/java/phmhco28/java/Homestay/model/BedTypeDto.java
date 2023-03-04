package phmhco28.java.Homestay.model;
import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BedTypeDto {
	private long bedTypeId;
	@NotBlank
	private String bedTypeName;
	
	
}
