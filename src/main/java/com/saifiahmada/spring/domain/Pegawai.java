package com.saifiahmada.spring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pegawai {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nama;
	
	private String golongan;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getGolongan() {
		return golongan;
	}

	public void setGolongan(String golongan) {
		this.golongan = golongan;
	}
	

}
