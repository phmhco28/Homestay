package phmhco28.java.Homestay.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageDto {
	private Integer imageId;
	private String path;
	private Integer postId;
}
