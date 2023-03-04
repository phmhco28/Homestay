package phmhco28.java.Homestay.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomType {
	@Id
	private Integer roomTypeId;
	
	@Column(name = "room_type_name")
	private String roomTypeName;
	
	@OneToMany(mappedBy = "roomType")
	private List<RoomInfo> roomInfos;
}
