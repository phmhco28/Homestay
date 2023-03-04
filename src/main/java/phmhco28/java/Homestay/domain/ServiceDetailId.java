package phmhco28.java.Homestay.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ServiceDetailId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4408288184788310848L;

	@Column(name = "service_id")
	private Integer serviceId;
	
	@Column(name = "room_info_id")
	private Integer roomInfoId;
}
