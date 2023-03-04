package phmhco28.java.Homestay.model;


import java.util.List;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import phmhco28.java.Homestay.domain.Rating;
import phmhco28.java.Homestay.domain.Service;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
	private long postId;
	private long accountId;
	private long romTypeInfoId;
	private String userName;
	private String postDate;
	@NotBlank(message = "Bạn chưa nhập tiêu đề")
	private String title;
	@NotBlank(message = "Bạn chưa nhập nội dung tin")
	private String content;
	@NotBlank(message = "Bạn chưa nhập tên khách sạn!")
	private String hotelName;
	private int status;
	@NotNull(message = "Bạn chưa nhập giá!")
	private Double price;	
	private long locationId;
	private String locationName;
	@NotEmpty(message = "Bạn chưa nhập địa chỉ!")
	private String address;
	private double area;
	@NotNull(message = "Bạn chưa nhập số phòng!")
	private int roomAmount;
	private long roomTypeId;
	
	private String roomTypeName;
	private long bedTypeId;
	private String bedTypeName;
	private List<Long> lstServiceIds;	
	private List<String> lstServiceNames;
	private List<Service> lstServices;
	private List<Rating> lstRatings;
	private List<RatingDto> lstRatingDtos;
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private String image5;
	private String authorImage;
	private String authorPhoneNumber;
	private int ratingAmount;
	private double avarageStarNumber;
	private String regisDate;
	private int hostRatingAmount;
	public PostDto(long accountId, long postId, long romTypeInfoId, String userName, String regisDate, String postDate,
			@NotBlank(message = "Bạn chưa nhập tiêu đề") String title,
			@NotBlank(message = "Bạn chưa nhập nội dung tin") String content,
			@NotBlank(message = "Bạn chưa nhập tên khách sạn!") String hotelName, int status,
			@NotNull(message = "Bạn chưa nhập giá!") Double price, String locationName,
			@NotEmpty(message = "Bạn chưa nhập địa chỉ!") String address, double area,
			@NotNull(message = "Bạn chưa nhập số phòng!") int roomAmount, String roomTypeName, String bedTypeName, String authorImage, String authorPhoneNumber) {
		super();
		this.accountId = accountId;
		this.postId = postId;
		this.romTypeInfoId = romTypeInfoId;
		this.userName = userName;
		this.regisDate = regisDate;
		this.postDate = postDate;
		this.title = title;
		this.content = content;
		this.hotelName = hotelName;
		this.status = status;
		this.price = price;
		this.locationName = locationName;
		this.address = address;
		this.area = area;
		this.roomAmount = roomAmount;
		this.roomTypeName = roomTypeName;
		this.bedTypeName = bedTypeName;
		this.authorImage = authorImage;
		this.authorPhoneNumber = authorPhoneNumber;
	}
	
	
	
	
	
}
