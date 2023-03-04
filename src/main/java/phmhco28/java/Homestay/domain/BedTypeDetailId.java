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
public class BedTypeDetailId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2789622597664529986L;

	@Column(name = "room_info_id")
	private Integer roomInfoId;
	
	@Column(name = "bed_type_id")
	private Integer bedTypeId;
}
