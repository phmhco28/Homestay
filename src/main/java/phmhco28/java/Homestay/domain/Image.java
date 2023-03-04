package phmhco28.java.Homestay.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {
	@Id
	private Integer imageId;
	
	@Column
	private String path;
	
	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;
}
