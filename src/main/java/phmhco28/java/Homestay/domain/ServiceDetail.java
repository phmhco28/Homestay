package phmhco28.java.Homestay.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDetail {
	@EmbeddedId
	private ServiceDetailId serviceDetailId;
	
	@ManyToOne
	@MapsId("serviceId")
	@JoinColumn(name = "service_id")
	private Service service;
	
	@ManyToOne
	@MapsId("roomInfoId")
	@JoinColumn(name = "room_info_id")
	private RoomInfo roomInfo;
	
	@Column
	private String description;
}
