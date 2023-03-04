package phmhco28.java.Homestay.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccDto {
	
	public UserAccDto(@NotBlank(message = "Bạn chưa nhập tên người dùng") String name, String address, String sex,
			String dateOfBirth, String CCCD, String avatar,
			@Pattern(regexp = "^[0-9]{9,11}", message = "Số điện thoại phải bao gồm 9-11 chữ số") String phoneNumber,
			long accountId, @Email(message = "Email không hợp lệ") String mail,
			@Length(min = 6, message = "Password phải từ 6 kí tự trở lên") String password, String regisDate) {
		super();
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.dateOfBirth = dateOfBirth;
		this.CCCD = CCCD;
		this.avatar = avatar;
		this.phoneNumber = phoneNumber;
		this.accountId = accountId;
		this.mail = mail;
		this.password = password;
		RegisDate = regisDate;
	}
	private long roleId = 2;// Mặc định là người dùng
	@NotBlank(message = "Bạn chưa nhập tên người dùng")
	private String name;
	private String address;
	private String sex;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String dateOfBirth;
	private String CCCD;
	private String avatar;
	// @NotBlank(message = "Bạn chưa nhập số điện thoại")
	@Pattern(regexp = "^[0-9]{9,11}", message = "Số điện thoại phải bao gồm 9-11 chữ số")
	private String phoneNumber;
	private long accountId;
	@Email(message = "Email không hợp lệ")
	private String mail;
	@Length(min = 6, message = "Password phải từ 6 kí tự trở lên")
	private String password;
	private String RegisDate;
}
