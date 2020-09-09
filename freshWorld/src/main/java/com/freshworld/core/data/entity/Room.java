package com.freshworld.core.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROOM")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ROOM_ID")
	private long roon_id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "ROOM_NUMBER")
	private String room_number;

	@Column(name = "BED_INFO")
	private String bed_info;

	public long getRoon_id() {
		return roon_id;
	}

	public void setRoon_id(long roon_id) {
		this.roon_id = roon_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoom_number() {
		return room_number;
	}

	public void setRoom_number(String room_number) {
		this.room_number = room_number;
	}

	public String getBed_info() {
		return bed_info;
	}

	public void setBed_info(String bed_info) {
		this.bed_info = bed_info;
	}

}
