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
public class User {
	@Id
	private Integer userId;
	
	@Column
	private String name;
	
	@Column(name = "date_of_birth")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfBirth;
	
	@Column
	private String sex;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "id_card")
	private String idCard;
	
	@Column
	private String address;
	
	@Column
	private String mail;
	
	@Column
	private String avatar;
	
	@Column(name = "registration_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date registrationDate;
	
	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account account;
	
}
