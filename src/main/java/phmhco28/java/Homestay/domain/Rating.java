package phmhco28.java.Homestay.domain;



import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
	@Id
	private Integer ratingId;
	
	@Column
	private String comment;
	
	@Column()
	private int star;
	
	@Column(name = "rating_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date ratingDate;
	
	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;
}
