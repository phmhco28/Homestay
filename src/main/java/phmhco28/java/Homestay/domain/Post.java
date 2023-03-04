package phmhco28.java.Homestay.domain;


import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
	@Id
	private Integer postId;
	
	@Column
	private String content;
	
	@Column(name = "post_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date postDate;
	
	@Column
	private int status;
	
	@Column
	private String title;
	
	@OneToMany(mappedBy = "post")
	private List<Rating> ratings;
	
	@OneToMany(mappedBy = "post")
	private List<Image> images;
	
	@OneToMany(mappedBy = "post")
	private List<RoomInfo> roomInfos;
	
	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account account;
}
