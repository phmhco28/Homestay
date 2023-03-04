package phmhco28.java.Homestay.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BedTypeDetailDto {
	 private Integer roomInfoId;
	 private Integer bedTypeId;
	 private String description;
}
