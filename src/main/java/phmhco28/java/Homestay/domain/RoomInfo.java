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
public class RoomInfo {
	@Id
	private Integer roomInfoId;
	
	@Column
	private Double area;
	
	@Column
	private Double price;
	
	@Column(name = "room_amount")
	private Integer roomAmount;
	
	@ManyToOne
	@JoinColumn(name = "homestay_id")
	private Homestay homestay;
	
	@ManyToOne
	@JoinColumn(name = "room_type_id")
	private RoomType roomType;
	
	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;
	
	@OneToMany(mappedBy = "roomInfo")
	private List<ServiceDetail> serviceDetails;
	
	@OneToMany(mappedBy = "roomInfo")
	private List<BedTypeDetail> bedTypeDetails;
	
}
