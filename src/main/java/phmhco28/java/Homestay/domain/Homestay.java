package phmhco28.java.Homestay.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Homestay {
	@Id
	private Integer homestayId;
	
	@Column(name = "homestay_name")
	private String homestayName;
	
	@Column(name = "homestay_address")
	private String homestayAddress;
	
	@Column
	private String description;
	
	@OneToMany(mappedBy = "homestay")
	private List<RoomInfo> roomInfos; 
	
	@ManyToOne
	@JoinColumn(name = "homestay")
	private Location location;
}
