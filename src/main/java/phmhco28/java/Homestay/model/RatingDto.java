package phmhco28.java.Homestay.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatingDto{
	
	private int starsNumber;
	private String comment;
	private String userName;
	private String userAvatar;
	private String ratingDate;
	private long postId;
	private long accountId;
	
	public RatingDto(int starsNumber, String comment, String userName, String userAvatar, String ratingDate) {
		super();
		this.starsNumber = starsNumber;
		this.comment = comment;
		this.userName = userName;
		this.userAvatar = userAvatar;
		this.ratingDate = ratingDate;
	}
}
